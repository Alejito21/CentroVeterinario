package co.edu.uniquindio.poo.centroveterinariofx.model;

import java.util.ArrayList;

public class Consulta {
    public String motivo;
    public String diagnostico;
    public Mascota mascota;
    public Historial historial;
    public ArrayList<Tratamiento> tratamientosRelacionados;

    public Consulta(String motivo, String diagnostico,Mascota mascota, Historial historial) {
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.mascota = mascota;
        this.historial = historial;
    }


    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public ArrayList<Tratamiento> getTratamientosRelacionados() {
        return tratamientosRelacionados;
    }

    public void setTratamientosRelacionados(ArrayList<Tratamiento> tratamientosRelacionados) {
        this.tratamientosRelacionados = tratamientosRelacionados;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }
}
