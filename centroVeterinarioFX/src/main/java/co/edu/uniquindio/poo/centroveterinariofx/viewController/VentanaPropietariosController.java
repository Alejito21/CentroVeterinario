package co.edu.uniquindio.poo.centroveterinariofx.viewController;
import co.edu.uniquindio.poo.centroveterinariofx.model.Propietario;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class VentanaPropietariosController {

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
    }
    @FXML
    public void eliminarEmpleadoAction(javafx.event.ActionEvent actionEvent) {

    }
}
