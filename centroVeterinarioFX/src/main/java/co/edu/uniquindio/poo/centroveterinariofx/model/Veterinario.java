package co.edu.uniquindio.poo.centroveterinariofx.model;

import java.util.ArrayList;

public class Veterinario extends Persona{
    public String numeroLicencia;
    public Especialidad especialidad;
    public ArrayList<Cita> citasAgendadas;

    public Veterinario(String nombre, String apellido, String telefono, String correo,String numeroLicencia,Especialidad especialidad) {
        super(nombre,apellido,telefono,correo);
        this.numeroLicencia = numeroLicencia;
        this.especialidad = especialidad;
        this.citasAgendadas = new ArrayList<>();
    }


    public void agregarCita(Cita cita){
        citasAgendadas.add(cita);
    }



    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<Cita> getCitasAgendadas() {
        return citasAgendadas;
    }

    public void setCitasAgendadas(ArrayList<Cita> citasAgendadas) {
        this.citasAgendadas = citasAgendadas;
    }
}
