module co.edu.uniquindio.poo.centroveterinariofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.mail;
    requires java.desktop;


    opens co.edu.uniquindio.poo.centroveterinariofx to javafx.fxml;
    opens co.edu.uniquindio.poo.centroveterinariofx.viewController to javafx.fxml;
    opens co.edu.uniquindio.poo.centroveterinariofx.model to javafx.base;


    exports co.edu.uniquindio.poo.centroveterinariofx;
    exports co.edu.uniquindio.poo.centroveterinariofx.viewController;
}