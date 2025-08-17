package co.edu.uniquindio.poo.centroveterinariofx.model;

import java.util.ArrayList;

public class PersonalApoyo extends Persona {
    public String identificacionApoyo;
    public ArrayList<Cita> citasAgendadas;

    public PersonalApoyo(String nombre, String apellido, String telefono, String correo, String identificacionApoyo) {
        super(nombre, apellido, telefono, correo);
        this.identificacionApoyo = identificacionApoyo;
        this.citasAgendadas = new ArrayList<>();
    }

    public void agregarCita(Cita cita){
        citasAgendadas.add(cita);
    }


    public String getIdentificacionApoyo() {
        return identificacionApoyo;
    }

    public void setIdentificacionApoyo(String identificacionApoyo) {
        this.identificacionApoyo = identificacionApoyo;
    }

    public ArrayList<Cita> getCitasAgendadas() {
        return citasAgendadas;
    }

    public void setCitasAgendadas(ArrayList<Cita> citasAgendadas) {
        this.citasAgendadas = citasAgendadas;
    }
}
