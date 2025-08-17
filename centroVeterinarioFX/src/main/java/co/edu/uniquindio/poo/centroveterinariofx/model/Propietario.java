package co.edu.uniquindio.poo.centroveterinariofx.model;

import java.util.ArrayList;

public class Propietario extends Persona {
    public String direccion;
    public ArrayList<Mascota> mascotasPropietario;

    // Método: public Propietario(String nombre, String apellido, String telefono, String correo,String direccion)
    // Descripción: Explica la funcionalidad de este método
    public Propietario(String nombre, String apellido, String telefono, String correo,String direccion) {
        super(nombre, apellido, telefono, correo);
        this.direccion = direccion;
        this.mascotasPropietario = new ArrayList<>();
    }

    // Método: public void agregarMascota(Mascota mascota)
    // Descripción: Explica la funcionalidad de este método
    public void agregarMascota(Mascota mascota){
        mascotasPropietario.add(mascota);
    }


    // Método: public String getDireccion()
    // Descripción: Explica la funcionalidad de este método
    public String getDireccion() {
        return direccion;
    }

    // Método: public void setDireccion(String direccion)
    // Descripción: Explica la funcionalidad de este método
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método: public ArrayList<Mascota> getMascotasPropietario()
    // Descripción: Explica la funcionalidad de este método
    public ArrayList<Mascota> getMascotasPropietario() {
        return mascotasPropietario;
    }

    // Método: public void setMascotasPropietario(ArrayList<Mascota> mascotasPropietario)
    // Descripción: Explica la funcionalidad de este método
    public void setMascotasPropietario(ArrayList<Mascota> mascotasPropietario) {
        this.mascotasPropietario = mascotasPropietario;
    }
}
