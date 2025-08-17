package co.edu.uniquindio.poo.centroveterinariofx.controller;

import co.edu.uniquindio.poo.centroveterinariofx.model.CentroVeterinario;
import co.edu.uniquindio.poo.centroveterinariofx.model.Cita;
import javafx.event.ActionEvent;

public class CitasController {
    private CentroVeterinario centroVeterinario;

    public CitasController(CentroVeterinario centroVeterinario) {
        this.centroVeterinario = centroVeterinario;
    }
    

    public CentroVeterinario getCentroVeterinario() {
        return centroVeterinario;
    }
}
