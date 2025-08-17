package co.edu.uniquindio.poo.centroveterinariofx.model;

import java.util.Date;

public class Cita {
    public Date fecha;
    public String hora;
    public Mascota mascota;
    public Veterinario veterinario;

    public Cita (Date fecha, String hora, Mascota mascota, Veterinario veterinario) {
        this.fecha = fecha;
        this.hora = hora;
        this.mascota = mascota;
        this.veterinario = veterinario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
}
