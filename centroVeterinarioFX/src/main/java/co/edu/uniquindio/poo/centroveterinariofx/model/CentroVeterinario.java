package co.edu.uniquindio.poo.centroveterinariofx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

public class CentroVeterinario {
    public String nombre;
    public String ubicacion;
    public ArrayList<Cita> listaCitas;
    public ArrayList<Mascota> listaMascotas;
    public ArrayList<Persona> listaPersonas;
    public ArrayList<Veterinario> listaVeterinarios;
    public ArrayList<Propietario> listaPropietarios;

    public CentroVeterinario(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.listaCitas = new ArrayList<>();
        this.listaMascotas = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
        this.listaVeterinarios = new ArrayList<>();
        this.listaPropietarios = new ArrayList<>();
    }

    public boolean agregarCita(Cita cita) {
        boolean centinela = false;
        if (!verificarCita(cita.getFecha(), cita.getHora())){
            listaCitas.add(cita);
            centinela = true;
        }
        return centinela;
    }

    public boolean verificarCita(String fecha, String hora) {
        boolean centinela = false;
        for (Cita cita : listaCitas) {
            if (cita.getFecha().equals(fecha) && cita.getHora().equals(hora)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean agregarMascota(Mascota mascota) {
        boolean centinela = false;
        if (!verificarMascota(mascota.getIdentiifcacion())){
            listaMascotas.add(mascota);
            centinela = true;
        }
        return centinela;
    }

    public boolean verificarMascota(String identificacion) {
        boolean centinela = false;
        for (Mascota mascota : listaMascotas) {
            if (mascota.getIdentiifcacion().equals(identificacion)) {
                centinela = true;
            }
        }
        return centinela;
    }


    public boolean eliminarMacota(String identificacion) {
        boolean centinela = false;
        for (Mascota mascota : listaMascotas) {
            if (mascota.getIdentiifcacion().equals(identificacion)) {
                listaMascotas.remove(mascota);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean agregarPersona(Persona persona) {
        boolean centinela = false;
        if (!verificarPersona(persona.getCorreo())){
            listaPersonas.add(persona);
            centinela = true;
        }
        return centinela;
    }

    public boolean verificarPersona(String correo) {
        boolean centinela = false;
        for (Persona persona: listaPersonas) {
            if (persona.getCorreo().equals(correo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean eliminarPersona(String correo) {
        boolean centinela = false;
        for (Persona persona : listaPersonas) {
            if (persona.getCorreo().equals(correo)) {
                listaPersonas.remove(persona);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean agregarVeterinario(Veterinario veterinario) {
        boolean centinela = false;
        if (!verificarVeterinario(veterinario.getNumeroLicencia())){
            listaVeterinarios.add(veterinario);
            centinela = true;
        }
        return centinela;
    }

    public boolean verificarVeterinario(String licencia) {
        boolean centinela = false;
        for (Veterinario veterinario: listaVeterinarios) {
            if (veterinario.getNumeroLicencia().equals(licencia)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean eliminarVeterinario(String licencia) {
        boolean centinela = false;
        for (Veterinario veterinario : listaVeterinarios) {
            if (veterinario.getNumeroLicencia().equals(licencia)) {
                listaVeterinarios.remove(veterinario);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean agregarPropietario(Propietario propietario) {
        boolean centinela = false;
        if (!verificarPropietario(propietario.getDireccion())){
            listaPropietarios.add(propietario);
            centinela = true;
        }
        return centinela;
    }

    public boolean verificarPropietario(String direccion) {
        boolean centinela = false;
        for (Propietario propietario: listaPropietarios) {
            if (propietario.getDireccion().equals(direccion)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean eliminarPropietario(String direccion) {
        boolean centinela = false;
        for (Propietario propietario: listaPropietarios) {
            if (propietario.getDireccion().equals(direccion)) {
                listaPropietarios.remove(propietario);
                centinela = true;
                break;
            }
        }
        return centinela;
    }


    public ArrayList<Cita> averiguarCitasDia(String fechaIdeal) {
        ArrayList<Cita> CitasDia = new ArrayList<>();
        for (Cita cita: listaCitas) {
            String fecha = cita.getFecha();
            if(fecha.equals(fechaIdeal)) {
                CitasDia.add(cita);
            }
        }

        return CitasDia;
    }

    public ArrayList<Veterinario> getListaVeterinarios() {
        return listaVeterinarios;
    }

    public void setListaVeterinarios(ArrayList<Veterinario> listaVeterinarios) {
        this.listaVeterinarios = listaVeterinarios;
    }

    public ArrayList<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(ArrayList<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public ArrayList<Cita> getListaCitas() {
        return listaCitas;
    }

    public void setListaCitas(ArrayList<Cita> listaCitas) {
        this.listaCitas = listaCitas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
