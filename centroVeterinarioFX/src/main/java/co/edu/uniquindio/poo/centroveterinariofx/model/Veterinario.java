package co.edu.uniquindio.poo.centroveterinariofx.model;

import java.util.ArrayList;

public class Veterinario extends Persona{
    public String numeroLicencia;
    public Especialidad especialidad;
    public ArrayList<Cita> citasAgendadas;

    // Método: public Veterinario(String nombre, String apellido, String telefono, String correo,String numeroLicencia,Especialidad especialidad)
    // Descripción: Explica la funcionalidad de este método
    public Veterinario(String nombre, String apellido, String telefono, String correo,String numeroLicencia,Especialidad especialidad) {
        super(nombre,apellido,telefono,correo);
        this.numeroLicencia = numeroLicencia;
        this.especialidad = especialidad;
        this.citasAgendadas = new ArrayList<>();
    }


    // Método: public void agregarCita(Cita cita)
    // Descripción: Explica la funcionalidad de este método
    public void agregarCita(Cita cita){
        citasAgendadas.add(cita);
    }



    // Método: public String getNumeroLicencia()
    // Descripción: Explica la funcionalidad de este método
    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    // Método: public void setNumeroLicencia(String numeroLicencia)
    // Descripción: Explica la funcionalidad de este método
    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    // Método: public Especialidad getEspecialidad()
    // Descripción: Explica la funcionalidad de este método
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    // Método: public void setEspecialidad(Especialidad especialidad)
    // Descripción: Explica la funcionalidad de este método
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    // Método: public ArrayList<Cita> getCitasAgendadas()
    // Descripción: Explica la funcionalidad de este método
    public ArrayList<Cita> getCitasAgendadas() {
        return citasAgendadas;
    }

    // Método: public void setCitasAgendadas(ArrayList<Cita> citasAgendadas)
    // Descripción: Explica la funcionalidad de este método
    public void setCitasAgendadas(ArrayList<Cita> citasAgendadas) {
        this.citasAgendadas = citasAgendadas;
    }
}
