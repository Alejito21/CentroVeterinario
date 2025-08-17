package co.edu.uniquindio.poo.centroveterinariofx.viewController;
import co.edu.uniquindio.poo.centroveterinariofx.model.Especialidad;
import co.edu.uniquindio.poo.centroveterinariofx.model.Propietario;
import co.edu.uniquindio.poo.centroveterinariofx.model.Veterinario;
import co.edu.uniquindio.poo.centroveterinariofx.model.CentroVeterinario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class VentanaVeterinarioController implements Initializable {
    private CentroVeterinario centroVeterinario;
    private ObservableList<Veterinario> listaVeterinarios = FXCollections.observableArrayList();

    public void setCentroVeterinario(CentroVeterinario centroVeterinario) {
        this.centroVeterinario = centroVeterinario;
        cargarVeterinarios();
    }

    private void cargarVeterinarios() {
        if (centroVeterinario != null) {
            listaVeterinarios.setAll(centroVeterinario.getListaVeterinarios());
            tabVeterinarios.setItems(listaVeterinarios);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Configurar columnas
        columnNombre.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getNombre()));
        columnTelefono.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getTelefono()));
        columnNumeroLicencia.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getNumeroLicencia()));
        columnEspecialidad.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getEspecialidad().toString()));
        // Llenar ChoiceBox de especialidades
        boxEspecialidad.setItems(FXCollections.observableArrayList(Especialidad.values()));
        tabVeterinarios.setItems(listaVeterinarios);
    }

    @FXML
    private TableView<Veterinario> tabVeterinarios;
    @FXML
    private TableColumn<Veterinario, String> columnTelefono;
    @FXML
    private TableColumn<Veterinario, String> columnEspecialidad;
    @FXML
    private TableColumn<Veterinario, String> columnNombre;
    @FXML
    private TableColumn<Veterinario, String> columnNumeroLicencia;


    @FXML
    private ChoiceBox<Especialidad> boxEspecialidad;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnAgregar;


    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtNumeroLicencia;
    @FXML
    private TextField txtCorreo;


    @FXML
    void ff8c00(ActionEvent event) {

    }



    @FXML
    public void agregarVeterinarioAction(javafx.event.ActionEvent actionEvent) {
        if (centroVeterinario == null) return;
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String telefono = txtTelefono.getText();
        String correo = txtCorreo.getText();
        String numeroLicencia = txtNumeroLicencia.getText();
        Especialidad especialidad = boxEspecialidad.getValue();
        if (nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || correo.isEmpty() || numeroLicencia.isEmpty() || especialidad == null) {
            // Puedes mostrar una alerta aquí
            return;
        }
        Veterinario veterinario = new Veterinario(nombre, apellido, telefono, correo, numeroLicencia, especialidad);
        boolean exito = centroVeterinario.agregarVeterinario(veterinario);
        if (exito) {
            listaVeterinarios.add(veterinario);
            tabVeterinarios.refresh();
            limpiarCampos();
        } else {
            // Puedes mostrar una alerta de error (duplicado)
        }
    }

    @FXML
    public void eliminarVeterinarioAction(javafx.event.ActionEvent actionEvent) {
        if (centroVeterinario == null) return;
        Veterinario seleccionado = tabVeterinarios.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            boolean exito = centroVeterinario.eliminarVeterinario(seleccionado.getNumeroLicencia());
            if (exito) {
                listaVeterinarios.remove(seleccionado);
                tabVeterinarios.refresh();
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
        txtApellido.clear();
        txtTelefono.clear();
        txtCorreo.clear();
        txtNumeroLicencia.clear();
        boxEspecialidad.getSelectionModel().clearSelection();
    }

}
