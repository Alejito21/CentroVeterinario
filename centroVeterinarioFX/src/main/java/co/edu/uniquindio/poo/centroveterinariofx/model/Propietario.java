package co.edu.uniquindio.poo.centroveterinariofx.model;

import java.util.ArrayList;

public class Propietario extends Persona {
    public String direccion;
    public ArrayList<Mascota> mascotasPropietario;

    public Propietario(String nombre, String apellido, String telefono, String correo,String direccion) {
        super(nombre, apellido, telefono, correo);
        this.direccion = direccion;
        this.mascotasPropietario = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota){
        mascotasPropietario.add(mascota);
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Mascota> getMascotasPropietario() {
        return mascotasPropietario;
    }

    public void setMascotasPropietario(ArrayList<Mascota> mascotasPropietario) {
        this.mascotasPropietario = mascotasPropietario;
    }
}
