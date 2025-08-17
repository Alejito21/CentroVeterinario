package co.edu.uniquindio.poo.centroveterinariofx.model;

import java.util.Date;

public class Cita {
    public Date fecha;
    public String hora;
    public Mascota mascota;
    public Veterinario veterinario;

    // Método: public Cita (Date fecha, String hora, Mascota mascota, Veterinario veterinario)
    // Descripción: Explica la funcionalidad de este método
    public Cita (Date fecha, String hora, Mascota mascota, Veterinario veterinario) {
        this.fecha = fecha;
        this.hora = hora;
        this.mascota = mascota;
        this.veterinario = veterinario;
    }

    // Método: public Date getFecha()
    // Descripción: Explica la funcionalidad de este método
    public Date getFecha() {
        return fecha;
    }

    // Método: public void setFecha(Date fecha)
    // Descripción: Explica la funcionalidad de este método
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Método: public String getHora()
    // Descripción: Explica la funcionalidad de este método
    public String getHora() {
        return hora;
    }

    // Método: public void setHora(String hora)
    // Descripción: Explica la funcionalidad de este método
    public void setHora(String hora) {
        this.hora = hora;
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

    // Método: public Veterinario getVeterinario()
    // Descripción: Explica la funcionalidad de este método
    public Veterinario getVeterinario() {
        return veterinario;
    }

    // Método: public void setVeterinario(Veterinario veterinario)
    // Descripción: Explica la funcionalidad de este método
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
}
