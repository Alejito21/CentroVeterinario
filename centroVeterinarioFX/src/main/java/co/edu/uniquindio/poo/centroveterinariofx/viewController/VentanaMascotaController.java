package co.edu.uniquindio.poo.centroveterinariofx.viewController;
import co.edu.uniquindio.poo.centroveterinariofx.controller.MascotaController;
import co.edu.uniquindio.poo.centroveterinariofx.model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.awt.event.ActionEvent;

public class VentanaMascotaController {
    private ObservableList<Mascota> mascotasPropietario = FXCollections.observableArrayList();
    private Mascota mascotaActual;
    private MascotaController mascotaController;

    public void setMascotaController(MascotaController mascotaController) {
        this.mascotaController = mascotaController;


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
    public void agregarMascotaAction(javafx.event.ActionEvent actionEvent){

    }

    @FXML
     public void mostrarConsultasAction(javafx.event.ActionEvent actionEvent) {

    }

    @FXML
    public void eliminarMascotaAction(javafx.event.ActionEvent actionEvent) {

    }

}
