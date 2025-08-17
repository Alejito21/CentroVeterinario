package co.edu.uniquindio.poo.centroveterinariofx.viewController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import co.edu.uniquindio.poo.centroveterinariofx.model.CentroVeterinario;
import javafx.scene.Node;

public class VentanaGestionController {
    private CentroVeterinario centroVeterinario;

    public void setCentroVeterinario(CentroVeterinario centroVeterinario) {
        this.centroVeterinario = centroVeterinario;
    }

    @FXML
    public void abrirMascotas(javafx.event.ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/centroveterinariofx/view/Mascota.fxml"));
        Scene scene = new Scene(loader.load());
        co.edu.uniquindio.poo.centroveterinariofx.viewController.VentanaMascotaController controller = loader.getController();
        controller.setCentroVeterinario(centroVeterinario);
        Stage stage = new Stage();
        stage.setTitle("Gestión Mascotas");
        stage.setScene(scene);
        stage.show();
        // Cerrar esta ventana
        Node source = (Node) actionEvent.getSource();
        Stage thisStage = (Stage) source.getScene().getWindow();
        thisStage.close();
    }

    @FXML
    public void abrirPropietarios(javafx.event.ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/centroveterinariofx/view/Propietarios.fxml"));
        Scene scene = new Scene(loader.load());
        co.edu.uniquindio.poo.centroveterinariofx.viewController.VentanaPropietariosController controller = loader.getController();
        controller.setCentroVeterinario(centroVeterinario);
        Stage stage = new Stage();
        stage.setTitle("Gestión Propietarios");
        stage.setScene(scene);
        stage.show();
        // Cerrar esta ventana
        Node source = (Node) actionEvent.getSource();
        Stage thisStage = (Stage) source.getScene().getWindow();
        thisStage.close();
    }

    @FXML
    public void abrirVeterinarios(javafx.event.ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/centroveterinariofx/view/Veterinario.fxml"));
        Scene scene = new Scene(loader.load());
        co.edu.uniquindio.poo.centroveterinariofx.viewController.VentanaVeterinarioController controller = loader.getController();
        controller.setCentroVeterinario(centroVeterinario);
        Stage stage = new Stage();
        stage.setTitle("Gestión Veterinarios");
        stage.setScene(scene);
        stage.show();
        // Cerrar esta ventana
        Node source = (Node) actionEvent.getSource();
        Stage thisStage = (Stage) source.getScene().getWindow();
        thisStage.close();
    }
}
