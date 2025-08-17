package co.edu.uniquindio.poo.centroveterinariofx.model;

import java.util.ArrayList;

public class PersonalApoyo extends Persona {
    public String identificacionApoyo;
    public ArrayList<Cita> citasAgendadas;

    // Método: public PersonalApoyo(String nombre, String apellido, String telefono, String correo, String identificacionApoyo)
    // Descripción: Explica la funcionalidad de este método
    public PersonalApoyo(String nombre, String apellido, String telefono, String correo, String identificacionApoyo) {
        super(nombre, apellido, telefono, correo);
        this.identificacionApoyo = identificacionApoyo;
        this.citasAgendadas = new ArrayList<>();
    }

    // Método: public void agregarCita(Cita cita)
    // Descripción: Explica la funcionalidad de este método
    public void agregarCita(Cita cita){
        citasAgendadas.add(cita);
    }


    // Método: public String getIdentificacionApoyo()
    // Descripción: Explica la funcionalidad de este método
    public String getIdentificacionApoyo() {
        return identificacionApoyo;
    }

    // Método: public void setIdentificacionApoyo(String identificacionApoyo)
    // Descripción: Explica la funcionalidad de este método
    public void setIdentificacionApoyo(String identificacionApoyo) {
        this.identificacionApoyo = identificacionApoyo;
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
