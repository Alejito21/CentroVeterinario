package co.edu.uniquindio.poo.centroveterinariofx.viewController;
import co.edu.uniquindio.poo.centroveterinariofx.model.Especialidad;
import co.edu.uniquindio.poo.centroveterinariofx.model.Propietario;
import co.edu.uniquindio.poo.centroveterinariofx.model.Veterinario;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.awt.event.ActionEvent;

public class VentanaVeterinarioController {

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

    }

    @FXML
    public void eliminarVeterinarioAction(javafx.event.ActionEvent actionEvent) {

    }


}
