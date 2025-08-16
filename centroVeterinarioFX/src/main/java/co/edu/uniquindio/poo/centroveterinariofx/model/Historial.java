package co.edu.uniquindio.poo.centroveterinariofx.model;

import java.util.ArrayList;

public class Historial {
    public ArrayList<Consulta> consultasRelacionadas;

    public Historial() {
        consultasRelacionadas = new ArrayList<>();
    }

    public ArrayList<Consulta> getConsultasRelacionadas() {
        return consultasRelacionadas;
    }

    public void setConsultasRelacionadas(ArrayList<Consulta> consultasRelacionadas) {
        this.consultasRelacionadas = consultasRelacionadas;
    }
}


