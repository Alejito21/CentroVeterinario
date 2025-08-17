package co.edu.uniquindio.poo.centroveterinariofx.viewController;
import co.edu.uniquindio.poo.centroveterinariofx.model.Propietario;
import co.edu.uniquindio.poo.centroveterinariofx.model.CentroVeterinario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.stage.Stage;
import javafx.scene.Node;

public class VentanaPropietariosController implements Initializable {
    private CentroVeterinario centroVeterinario;
    private ObservableList<Propietario> listaPropietarios = FXCollections.observableArrayList();

    public void setCentroVeterinario(CentroVeterinario centroVeterinario) {
        this.centroVeterinario = centroVeterinario;
        cargarPropietarios();
    }

    private void cargarPropietarios() {
        if (centroVeterinario != null) {
            listaPropietarios.setAll(centroVeterinario.getListaPropietarios());
            tabPropietarios.setItems(listaPropietarios);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        columnNombre.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getNombre()));
        columnApellido.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getApellido()));
        columnTelefono.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getTelefono()));
        columnDireccion.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getDireccion()));
        tabPropietarios.setItems(listaPropietarios);
    }

    @FXML
    private TableView<Propietario> tabPropietarios;
    @FXML
    private TableColumn<Propietario, String> columnTelefono;
    @FXML
    private TableColumn<Propietario, String> columnDireccion;
    @FXML
    private TableColumn<Propietario, String> columnApellido;
    @FXML
    private TableColumn<Propietario, String> columnNombre;

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtDireccion;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtCorreo;



    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnAgregar;




    @FXML
    void ff8800(ActionEvent event) {

    }

    @FXML
    public void agregarEmpleadoAction(javafx.event.ActionEvent actionEvent) {
        if (centroVeterinario == null) return;
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String telefono = txtTelefono.getText();
        String correo = txtCorreo.getText();
        String direccion = txtDireccion.getText();
        if (nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || correo.isEmpty() || direccion.isEmpty()) {
            return;
        }
        Propietario propietario = new Propietario(nombre, apellido, telefono, correo, direccion);
        boolean exito = centroVeterinario.agregarPropietario(propietario);
        if (exito) {
            listaPropietarios.add(propietario);
            tabPropietarios.refresh();
            limpiarCampos();
        }
    }

    @FXML
    public void eliminarEmpleadoAction(javafx.event.ActionEvent actionEvent) {
        if (centroVeterinario == null) return;
        Propietario seleccionado = tabPropietarios.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            boolean exito = centroVeterinario.eliminarPropietario(seleccionado.getDireccion());
            if (exito) {
                listaPropietarios.remove(seleccionado);
                tabPropietarios.refresh();
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
        txtDireccion.clear();
    }
}
