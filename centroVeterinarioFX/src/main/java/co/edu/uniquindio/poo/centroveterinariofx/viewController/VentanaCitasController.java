package co.edu.uniquindio.poo.centroveterinariofx.viewController;
import co.edu.uniquindio.poo.centroveterinariofx.controller.CitasController;
import co.edu.uniquindio.poo.centroveterinariofx.model.CentroVeterinario;
import co.edu.uniquindio.poo.centroveterinariofx.model.Cita;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import co.edu.uniquindio.poo.centroveterinariofx.model.Mascota;
import co.edu.uniquindio.poo.centroveterinariofx.model.Veterinario;

public class VentanaCitasController {
    @FXML
    private TableView<Cita> tabCitas;
    @FXML
    private TableColumn<Cita,String> columnFecha;
    @FXML
    private TableColumn<Cita,String> columnHora;
    @FXML
    private TableColumn<Cita,String> columnMascota;
    @FXML
    private TableColumn<Cita,String> columnVeterinario;


    @FXML
    private Button btnMostrarCitas;
    @FXML
    private Button btnAgendarCita;


    @FXML
    private TextField txtHora;
    @FXML
    private TextField txtFecha;
    @FXML
    private TextField txtMascota;
    @FXML
    private TextField txtVeterinario;

    private ObservableList<Cita> citas = FXCollections.observableArrayList();
    private CitasController citasController;
    private Cita citaActual;

    public void setCitasController(CitasController citasController) {
        this.citasController = citasController;
    }


    @FXML
    public void mostrarCitasAction(javafx.event.ActionEvent actionEvent) {
    }

    @FXML
    public void agendarCitaAction(javafx.event.ActionEvent actionEvent) {
        // 1. Leer los datos de los campos de texto
        String fechaStr = txtFecha.getText();
        String hora = txtHora.getText();
        String nombreMascota = txtMascota.getText();
        String nombreVeterinario = txtVeterinario.getText();

        // 2. Convertir la fecha
        String fecha = null;

        // 3. Buscar la mascota y el veterinario
        Mascota mascota = buscarMascotaPorNombre(nombreMascota);
        Veterinario veterinario = buscarVeterinarioPorNombre(nombreVeterinario);

        if (mascota == null || veterinario == null) {
            System.out.println("Mascota o veterinario no encontrados");
            return;
        }

        // 4. Crear la cita
        Cita cita = new Cita(fecha, hora, mascota, veterinario);

        // 5. Agregar la cita usando el controlador
        boolean exito = citasController.getCentroVeterinario().agregarCita(cita);

        if (exito) {
            citas.add(cita);
            tabCitas.setItems(citas);
            // Limpiar campos
            txtFecha.clear();
            txtHora.clear();
            txtMascota.clear();
            txtVeterinario.clear();
        } else {
            System.out.println("No se pudo agregar la cita (puede estar duplicada)");
        }
    }

    private Mascota buscarMascotaPorNombre(String nombre) {
        for (Mascota m : citasController.getCentroVeterinario().getListaMascotas()) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                return m;
            }
        }
        return null;
    }

    private Veterinario buscarVeterinarioPorNombre(String nombre) {
        for (Veterinario v : citasController.getCentroVeterinario().getListaVeterinarios()) {
            if (v.getNombre().equalsIgnoreCase(nombre)) {
                return v;
            }
        }
        return null;
    }

    public CitasController getCitasController() {
        return citasController;
    }
}
