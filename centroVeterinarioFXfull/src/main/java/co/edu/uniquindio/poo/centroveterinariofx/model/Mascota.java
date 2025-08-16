package co.edu.uniquindio.poo.centroveterinariofx.model;

import java.util.ArrayList;

public class Mascota {
    public String nombre;
    public String raza;
    public int edad;
    public String identiifcacion;
    public Especie especie;
    public Propietario propietario;
    public ArrayList<Consulta> consultasMascota;
    public ArrayList<Cita> citasMascota;

    public Mascota(String nombre, String raza, int edad, String identiifcacion, Especie especie, Propietario propietario, Consulta consulta) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.identiifcacion = identiifcacion;
        this.especie = especie;
        this.propietario = propietario;
        this.consultasMascota = new ArrayList<>();
        this.citasMascota = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCita(Cita cita){
        citasMascota.add(cita);
    }

    public void agregarConsulta(Consulta consulta){
        consultasMascota.add(consulta);
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentiifcacion() {
        return identiifcacion;
    }

    public void setIdentiifcacion(String identiifcacion) {
        this.identiifcacion = identiifcacion;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public ArrayList<Consulta> getConsultasMascota() {
        return consultasMascota;
    }

    public void setConsultasMascota(ArrayList<Consulta> consultasMascota) {
        this.consultasMascota = consultasMascota;
    }

    public ArrayList<Cita> getCitasMascota() {
        return citasMascota;
    }

    public void setCitasMascota(ArrayList<Cita> citasMascota) {
        this.citasMascota = citasMascota;
    }
}
