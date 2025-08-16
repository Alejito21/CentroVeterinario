package co.edu.uniquindio.poo.centroveterinariofx.viewController;
import co.edu.uniquindio.poo.centroveterinariofx.controller.CitasController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;


public class VentanaMainController {
    private CitasController citasController;

    @FXML
    private Button btnAgendarCita;

    @FXML
    private Button btnRegistrar;

    @FXML
    void ff8400(ActionEvent event) {

    }


    @FXML
    void ff7000(ActionEvent event) {

    }


    @FXML
    void ff7300(ActionEvent event) {

    }

    @FXML
    public void abrirVentanaGestion(javafx.event.ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/centroveterinariofx/view/Gestion.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Gestión");
        stage.setScene(scene);
        stage.show();
    }

    public VentanaMainController() {
        // Crear el CentroVeterinario y el CitasController si no existen
        this.citasController = new co.edu.uniquindio.poo.centroveterinariofx.controller.CitasController(
            new co.edu.uniquindio.poo.centroveterinariofx.model.CentroVeterinario("Centro Veterinario", "Ubicación")
        );
    }

    @FXML
    public void abrirVentanaCitas(javafx.event.ActionEvent actionEvent) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/centroveterinariofx/view/Citas.fxml"));
        Scene scene = new Scene(loader.load());
        VentanaCitasController controller = loader.getController();
        controller.setCitasController(citasController);
        Stage stage = new Stage();
        stage.setTitle("Gestion Citas");
        stage.setScene(scene);
        stage.show();
    }
}
