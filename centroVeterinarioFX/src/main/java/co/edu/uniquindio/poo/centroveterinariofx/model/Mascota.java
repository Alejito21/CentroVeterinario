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

    // Método: public Mascota(String nombre, String raza, int edad, String identiifcacion, Especie especie, Propietario propietario, Consulta consulta)
    // Descripción: Explica la funcionalidad de este método
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

    // Método: public String getNombre()
    // Descripción: Explica la funcionalidad de este método
    public String getNombre() {
        return nombre;
    }

    // Método: public void agregarCita(Cita cita)
    // Descripción: Explica la funcionalidad de este método
    public void agregarCita(Cita cita){
        citasMascota.add(cita);
    }

    // Método: public void agregarConsulta(Consulta consulta)
    // Descripción: Explica la funcionalidad de este método
    public void agregarConsulta(Consulta consulta){
        consultasMascota.add(consulta);
    }


    // Método: public void setNombre(String nombre)
    // Descripción: Explica la funcionalidad de este método
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método: public String getRaza()
    // Descripción: Explica la funcionalidad de este método
    public String getRaza() {
        return raza;
    }

    // Método: public void setRaza(String raza)
    // Descripción: Explica la funcionalidad de este método
    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Método: public int getEdad()
    // Descripción: Explica la funcionalidad de este método
    public int getEdad() {
        return edad;
    }

    // Método: public void setEdad(int edad)
    // Descripción: Explica la funcionalidad de este método
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método: public String getIdentiifcacion()
    // Descripción: Explica la funcionalidad de este método
    public String getIdentiifcacion() {
        return identiifcacion;
    }

    // Método: public void setIdentiifcacion(String identiifcacion)
    // Descripción: Explica la funcionalidad de este método
    public void setIdentiifcacion(String identiifcacion) {
        this.identiifcacion = identiifcacion;
    }

    // Método: public Especie getEspecie()
    // Descripción: Explica la funcionalidad de este método
    public Especie getEspecie() {
        return especie;
    }

    // Método: public void setEspecie(Especie especie)
    // Descripción: Explica la funcionalidad de este método
    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    // Método: public Propietario getPropietario()
    // Descripción: Explica la funcionalidad de este método
    public Propietario getPropietario() {
        return propietario;
    }

    // Método: public void setPropietario(Propietario propietario)
    // Descripción: Explica la funcionalidad de este método
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    // Método: public ArrayList<Consulta> getConsultasMascota()
    // Descripción: Explica la funcionalidad de este método
    public ArrayList<Consulta> getConsultasMascota() {
        return consultasMascota;
    }

    // Método: public void setConsultasMascota(ArrayList<Consulta> consultasMascota)
    // Descripción: Explica la funcionalidad de este método
    public void setConsultasMascota(ArrayList<Consulta> consultasMascota) {
        this.consultasMascota = consultasMascota;
    }

    // Método: public ArrayList<Cita> getCitasMascota()
    // Descripción: Explica la funcionalidad de este método
    public ArrayList<Cita> getCitasMascota() {
        return citasMascota;
    }

    // Método: public void setCitasMascota(ArrayList<Cita> citasMascota)
    // Descripción: Explica la funcionalidad de este método
    public void setCitasMascota(ArrayList<Cita> citasMascota) {
        this.citasMascota = citasMascota;
    }
}
