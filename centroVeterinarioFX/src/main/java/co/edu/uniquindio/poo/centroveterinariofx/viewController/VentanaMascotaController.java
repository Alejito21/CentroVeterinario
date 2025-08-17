package co.edu.uniquindio.poo.centroveterinariofx.viewController;
import co.edu.uniquindio.poo.centroveterinariofx.controller.MascotaController;
import co.edu.uniquindio.poo.centroveterinariofx.model.*;
import co.edu.uniquindio.poo.centroveterinariofx.model.CentroVeterinario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.stage.Stage;
import javafx.scene.Node;

public class VentanaMascotaController implements Initializable {
    private CentroVeterinario centroVeterinario;
    private ObservableList<Mascota> listaMascotas = FXCollections.observableArrayList();
    private Mascota mascotaActual;
    private MascotaController mascotaController;

    public void setMascotaController(MascotaController mascotaController) {
        this.mascotaController = mascotaController;


    }

    public void setCentroVeterinario(CentroVeterinario centroVeterinario) {
        this.centroVeterinario = centroVeterinario;
        cargarMascotas();
    }

    private void cargarMascotas() {
        if (centroVeterinario != null) {
            listaMascotas.setAll(centroVeterinario.getListaMascotas());
            tabMascotas.setItems(listaMascotas);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        columnNombre.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getNombre()));
        columnEspecie.setCellValueFactory(data -> new javafx.beans.property.SimpleObjectProperty<>(data.getValue().getEspecie()));
        columnEdad.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(String.valueOf(data.getValue().getEdad())));
        columnIdentificación.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getIdentiifcacion()));
        columnRaza.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getRaza()));
        boxEspecie.setItems(FXCollections.observableArrayList(Especie.values()));
        tabMascotas.setItems(listaMascotas);
    }

    @FXML
    private TableView<Mascota> tabMascotas;
    @FXML
    private TableColumn<Mascota,String> columnNombre;
    @FXML
    private TableColumn<Mascota,Especie> columnEspecie;
    @FXML
    private TableColumn<Mascota,String> columnEdad;
    @FXML
    private TableColumn<Mascota,String> columnIdentificación;
    @FXML
    private TableColumn<Mascota,String> columnRaza;



    @FXML
    private TextField txtPropietario;
    @FXML
    private TextField txtRaza;
    @FXML
    private Button btnConsultas;
    @FXML
    private TextField txtEdad;
    @FXML
    private TextField txtIdentificacion;
    @FXML
    private TextField txtNombre;


    @FXML
    private ComboBox<Especie> boxEspecie;



    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnEliminar;


    @FXML
    public void agregarMascotaAction(javafx.event.ActionEvent actionEvent) {
        if (centroVeterinario == null) return;
        String nombre = txtNombre.getText();
        String raza = txtRaza.getText();
        String edadStr = txtEdad.getText();
        String identificacion = txtIdentificacion.getText();
        Especie especie = boxEspecie.getValue();
        String propietarioNombre = txtPropietario.getText();
        if (nombre.isEmpty() || raza.isEmpty() || edadStr.isEmpty() || identificacion.isEmpty() || especie == null || propietarioNombre.isEmpty()) {
            mostrarAlerta("Campos incompletos", "Por favor llena todos los campos.");
            return;
        }
        int edad;
        try {
            edad = Integer.parseInt(edadStr);
        } catch (NumberFormatException e) {
            mostrarAlerta("Edad inválida", "La edad debe ser un número entero.");
            return;
        }
        Propietario propietario = null;
        for (Propietario p : centroVeterinario.getListaPropietarios()) {
            if (p.getNombre().equalsIgnoreCase(propietarioNombre)) {
                propietario = p;
                break;
            }
        }
        if (propietario == null) {
            mostrarAlerta("Propietario inválido", "No existe un propietario con ese nombre. No se puede agregar la mascota.");
            throw new IllegalArgumentException("No existe un propietario con ese nombre. No se puede agregar la mascota.");
        }
        Mascota mascota = new Mascota(nombre, raza, edad, identificacion, especie, propietario, null);
        boolean exito = centroVeterinario.agregarMascota(mascota);
        if (exito) {
            listaMascotas.add(mascota);
            tabMascotas.refresh();
            limpiarCampos();
        }
    }

    @FXML
     public void mostrarConsultasAction(javafx.event.ActionEvent actionEvent) {
        String nombreMascota = txtNombre.getText();
        if (nombreMascota.isEmpty()) {
            mostrarAlerta("Campo vacío", "Por favor ingresa el nombre de la mascota para consultar.");
            throw new IllegalArgumentException("El campo de nombre de mascota está vacío.");
        }
        Mascota mascota = null;
        for (Mascota m : listaMascotas) {
            if (m.getNombre().equalsIgnoreCase(nombreMascota)) {
                mascota = m;
                break;
            }
        }
        if (mascota == null) {
            mostrarAlerta("Mascota no encontrada", "No existe una mascota con ese nombre.");
            throw new IllegalArgumentException("No existe una mascota con ese nombre.");
        }
        // Aquí puedes mostrar las consultas de la mascota, por ejemplo en una nueva ventana o alerta
        mostrarAlerta("Consultas de la mascota", "Consultas encontradas: " + mascota.getConsultasMascota().size());
    }

    @FXML
    public void eliminarMascotaAction(javafx.event.ActionEvent actionEvent) {
        if (centroVeterinario == null) return;
        Mascota seleccionada = tabMascotas.getSelectionModel().getSelectedItem();
        if (seleccionada != null) {
            boolean exito = centroVeterinario.eliminarMacota(seleccionada.getIdentiifcacion());
            if (exito) {
                listaMascotas.remove(seleccionada);
                tabMascotas.refresh();
            }
        }
    }

    @FXML
    public void volverMainAction(javafx.event.ActionEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    private void limpiarCampos() {
        txtNombre.clear();
        txtRaza.clear();
        txtEdad.clear();
        txtIdentificacion.clear();
        boxEspecie.getSelectionModel().clearSelection();
        txtPropietario.clear();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
