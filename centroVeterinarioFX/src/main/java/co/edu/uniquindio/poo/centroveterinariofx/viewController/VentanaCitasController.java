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
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Alert;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public class VentanaCitasController implements Initializable {
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

    @FXML
    private ComboBox<String> comboMascotas;
    @FXML
    private ComboBox<String> comboVeterinarios;

    private ObservableList<Cita> citas = FXCollections.observableArrayList();
    private CitasController citasController;
    private Cita citaActual;

    public void setCitasController(CitasController citasController) {
        this.citasController = citasController;
        // Llenar el ComboBox de mascotas
        if (comboMascotas != null && citasController.getCentroVeterinario() != null) {
            ObservableList<String> nombresMascotas = FXCollections.observableArrayList();
            for (Mascota m : citasController.getCentroVeterinario().getListaMascotas()) {
                nombresMascotas.add(m.getNombre());
            }
            comboMascotas.setItems(nombresMascotas);
        }
        // Llenar el ComboBox de veterinarios
        if (comboVeterinarios != null && citasController.getCentroVeterinario() != null) {
            ObservableList<String> nombresVeterinarios = FXCollections.observableArrayList();
            for (Veterinario v : citasController.getCentroVeterinario().getListaVeterinarios()) {
                nombresVeterinarios.add(v.getNombre());
            }
            comboVeterinarios.setItems(nombresVeterinarios);
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Configurar las columnas de la tabla
        columnFecha.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(
            new SimpleDateFormat("dd/MM/yyyy").format(data.getValue().getFecha())
        ));
        columnHora.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getHora()));
        columnMascota.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getMascota().getNombre()));
        columnVeterinario.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getVeterinario().getNombre()));
        
        // Configurar la tabla
        tabCitas.setItems(citas);
    }

    @FXML
    public void mostrarCitasAction(javafx.event.ActionEvent actionEvent) {
        try {
            if (citasController == null) {
                mostrarAlerta("Error", "No se ha inicializado el controlador de citas.");
                throw new IllegalStateException("Controlador de citas no inicializado");
            }
            
            if (citasController.getCentroVeterinario() == null) {
                mostrarAlerta("Error", "No se ha inicializado el centro veterinario.");
                throw new IllegalStateException("Centro veterinario no inicializado");
            }
            
            // Obtener todas las citas del centro veterinario
            ObservableList<Cita> todasLasCitas = FXCollections.observableArrayList(
                citasController.getCentroVeterinario().getListaCitas()
            );
            
            if (todasLasCitas.isEmpty()) {
                mostrarAlerta("Información", "No hay citas registradas en el sistema.");
                return;
            }
            
            // Actualizar la tabla
            citas.clear();
            citas.addAll(todasLasCitas);
            tabCitas.refresh();
            
            mostrarAlerta("Éxito", "Se han cargado " + todasLasCitas.size() + " citas.");
            
        } catch (Exception e) {
            mostrarAlerta("Error", "Error al mostrar citas: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @FXML
    public void agendarCitaAction(javafx.event.ActionEvent actionEvent) {
        try {
            // Validar que el controlador esté inicializado
            if (citasController == null) {
                mostrarAlerta("Error", "No se ha inicializado el controlador de citas.");
                throw new IllegalStateException("Controlador de citas no inicializado");
            }
            if (citasController.getCentroVeterinario() == null) {
                mostrarAlerta("Error", "No se ha inicializado el centro veterinario.");
                throw new IllegalStateException("Centro veterinario no inicializado");
            }
            // 1. Validar campos vacíos
            String fechaStr = txtFecha.getText().trim();
            String hora = txtHora.getText().trim();
            String nombreMascota = txtMascota.getText().trim();
            String nombreVeterinario = txtVeterinario.getText().trim();
            if (fechaStr.isEmpty() || hora.isEmpty() || nombreMascota.isEmpty() || nombreVeterinario.isEmpty()) {
                mostrarAlerta("Error", "Todos los campos son obligatorios. Por favor complete todos los campos.");
                throw new IllegalArgumentException("Campos incompletos");
            }
            // 2. Validar formato de fecha
            Date fecha = null;
            try {
                fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaStr);
            } catch (ParseException e) {
                mostrarAlerta("Error", "Formato de fecha inválido. Use el formato dd/MM/yyyy (ejemplo: 25/12/2024)");
                throw new IllegalArgumentException("Formato de fecha inválido: " + fechaStr);
            }
            // 2.1 Validar formato de hora (HH:mm)
            if (!hora.matches("^(?:[01]\\d|2[0-3]):[0-5]\\d$")) {
                mostrarAlerta("Error", "Formato de hora inválido. Use el formato HH:mm (ejemplo: 14:30)");
                throw new IllegalArgumentException("Formato de hora inválido: " + hora);
            }
            // 3. Validar que la fecha no sea anterior a hoy
            Date hoy = new Date();
            if (fecha.before(hoy)) {
                mostrarAlerta("Error", "No se puede agendar una cita en una fecha pasada.");
                throw new IllegalArgumentException("Fecha en el pasado: " + fechaStr);
            }
            // 4. Buscar la mascota
            Mascota mascota = buscarMascotaPorNombre(nombreMascota);
            if (mascota == null) {
                mostrarAlerta("Error", "No se encontró la mascota '" + nombreMascota + "'. Verifique que esté registrada en el sistema.");
                throw new IllegalArgumentException("Mascota no encontrada: " + nombreMascota);
            }
            // 5. Buscar el veterinario
            Veterinario veterinario = buscarVeterinarioPorNombre(nombreVeterinario);
            if (veterinario == null) {
                mostrarAlerta("Error", "No se encontró el veterinario '" + nombreVeterinario + "'. Verifique que esté registrado en el sistema.");
                throw new IllegalArgumentException("Veterinario no encontrado: " + nombreVeterinario);
            }
            // 6. Crear la cita
            Cita cita = new Cita(fecha, hora, mascota, veterinario);
            // 7. Agregar la cita
            boolean exito = citasController.getCentroVeterinario().agregarCita(cita);
            if (exito) {
                citas.add(cita);
                tabCitas.refresh();
                // Limpiar campos
                txtFecha.clear();
                txtHora.clear();
                txtMascota.clear();
                txtVeterinario.clear();
                comboMascotas.getSelectionModel().clearSelection();
                comboVeterinarios.getSelectionModel().clearSelection();
                mostrarAlerta("Éxito", "Cita agendada exitosamente para " + mascota.getNombre() + " con el Dr. " + veterinario.getNombre());
            } else {
                mostrarAlerta("Error", "No se pudo agendar la cita. Posibles causas:\n- Ya existe una cita para esa fecha y hora\n- El veterinario no está disponible en ese horario");
                throw new IllegalStateException("No se pudo agregar la cita");
            }
        } catch (Exception e) {
            mostrarAlerta("Error", "Error al agendar cita: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize() {
        // Llenar el ComboBox de mascotas
        if (citasController != null && citasController.getCentroVeterinario() != null) {
            ObservableList<String> nombresMascotas = FXCollections.observableArrayList();
            for (Mascota m : citasController.getCentroVeterinario().getListaMascotas()) {
                nombresMascotas.add(m.getNombre());
            }
            comboMascotas.setItems(nombresMascotas);
            // Llenar el ComboBox de veterinarios
            ObservableList<String> nombresVeterinarios = FXCollections.observableArrayList();
            for (Veterinario v : citasController.getCentroVeterinario().getListaVeterinarios()) {
                nombresVeterinarios.add(v.getNombre());
            }
            comboVeterinarios.setItems(nombresVeterinarios);
        }
    }

    @FXML
    public void seleccionarMascotaCombo(javafx.event.ActionEvent event) {
        String nombreSeleccionado = comboMascotas.getSelectionModel().getSelectedItem();
        if (nombreSeleccionado != null) {
            txtMascota.setText(nombreSeleccionado);
        }
    }

    @FXML
    public void seleccionarVeterinarioCombo(javafx.event.ActionEvent event) {
        String nombreSeleccionado = comboVeterinarios.getSelectionModel().getSelectedItem();
        if (nombreSeleccionado != null) {
            txtVeterinario.setText(nombreSeleccionado);
        }
    }

    @FXML
    public void volverMainAction(javafx.event.ActionEvent event) {
        try {
            Node source = (Node) event.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            stage.close();
        } catch (Exception e) {
            mostrarAlerta("Error", "No se pudo volver al inicio: " + e.getMessage());
            e.printStackTrace();
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

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
