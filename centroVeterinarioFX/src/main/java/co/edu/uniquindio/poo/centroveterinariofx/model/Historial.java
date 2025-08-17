package co.edu.uniquindio.poo.centroveterinariofx.model;

import java.util.ArrayList;

public class Historial {
    public ArrayList<Consulta> consultasRelacionadas;

    // Método: public Historial()
    // Descripción: Explica la funcionalidad de este método
    public Historial() {
        consultasRelacionadas = new ArrayList<>();
    }

    // Método: public ArrayList<Consulta> getConsultasRelacionadas()
    // Descripción: Explica la funcionalidad de este método
    public ArrayList<Consulta> getConsultasRelacionadas() {
        return consultasRelacionadas;
    }

    // Método: public void setConsultasRelacionadas(ArrayList<Consulta> consultasRelacionadas)
    // Descripción: Explica la funcionalidad de este método
    public void setConsultasRelacionadas(ArrayList<Consulta> consultasRelacionadas) {
        this.consultasRelacionadas = consultasRelacionadas;
    }
}


