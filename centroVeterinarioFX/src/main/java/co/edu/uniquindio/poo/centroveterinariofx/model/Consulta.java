package co.edu.uniquindio.poo.centroveterinariofx.model;

import java.util.ArrayList;

public class Consulta {
    public String motivo;
    public String diagnostico;
    public Mascota mascota;
    public Historial historial;
    public ArrayList<Tratamiento> tratamientosRelacionados;

    // Método: public Consulta(String motivo, String diagnostico,Mascota mascota, Historial historial)
    // Descripción: Explica la funcionalidad de este método
    public Consulta(String motivo, String diagnostico,Mascota mascota, Historial historial) {
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.mascota = mascota;
        this.historial = historial;
    }


    // Método: public String getMotivo()
    // Descripción: Explica la funcionalidad de este método
    public String getMotivo() {
        return motivo;
    }

    // Método: public void setMotivo(String motivo)
    // Descripción: Explica la funcionalidad de este método
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    // Método: public String getDiagnostico()
    // Descripción: Explica la funcionalidad de este método
    public String getDiagnostico() {
        return diagnostico;
    }

    // Método: public void setDiagnostico(String diagnostico)
    // Descripción: Explica la funcionalidad de este método
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    // Método: public Mascota getMascota()
    // Descripción: Explica la funcionalidad de este método
    public Mascota getMascota() {
        return mascota;
    }

    // Método: public void setMascota(Mascota mascota)
    // Descripción: Explica la funcionalidad de este método
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    // Método: public ArrayList<Tratamiento> getTratamientosRelacionados()
    // Descripción: Explica la funcionalidad de este método
    public ArrayList<Tratamiento> getTratamientosRelacionados() {
        return tratamientosRelacionados;
    }

    // Método: public void setTratamientosRelacionados(ArrayList<Tratamiento> tratamientosRelacionados)
    // Descripción: Explica la funcionalidad de este método
    public void setTratamientosRelacionados(ArrayList<Tratamiento> tratamientosRelacionados) {
        this.tratamientosRelacionados = tratamientosRelacionados;
    }

    // Método: public Historial getHistorial()
    // Descripción: Explica la funcionalidad de este método
    public Historial getHistorial() {
        return historial;
    }

    // Método: public void setHistorial(Historial historial)
    // Descripción: Explica la funcionalidad de este método
    public void setHistorial(Historial historial) {
        this.historial = historial;
    }
}
