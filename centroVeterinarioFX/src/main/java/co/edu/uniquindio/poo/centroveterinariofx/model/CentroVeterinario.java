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

    // Método: public CentroVeterinario(String nombre, String ubicacion)
    // Descripción: Explica la funcionalidad de este método
    public CentroVeterinario(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.listaCitas = new ArrayList<>();
        this.listaMascotas = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
        this.listaVeterinarios = new ArrayList<>();
        this.listaPropietarios = new ArrayList<>();
    }

    // Método: public boolean agregarCita(Cita cita)
    // Descripción: Explica la funcionalidad de este método
    public boolean agregarCita(Cita cita) {
        boolean centinela = false;
        if (!verificarCita(cita.getFecha(), cita.getHora())){
            listaCitas.add(cita);
            centinela = true;
        }
        return centinela;
    }

    // Método: public boolean verificarCita(Date fecha, String hora)
    // Descripción: Explica la funcionalidad de este método
    public boolean verificarCita(Date fecha, String hora) {
        boolean centinela = false;
        for (Cita cita : listaCitas) {
            if (cita.getFecha().equals(fecha) && cita.getHora().equals(hora)) {
                centinela = true;
            }
        }
        return centinela;
    }

    // Método: public boolean agregarMascota(Mascota mascota)
    // Descripción: Explica la funcionalidad de este método
    public boolean agregarMascota(Mascota mascota) {
        boolean centinela = false;
        if (!verificarMascota(mascota.getIdentiifcacion())){
            listaMascotas.add(mascota);
            centinela = true;
        }
        return centinela;
    }

    // Método: public boolean verificarMascota(String identificacion)
    // Descripción: Explica la funcionalidad de este método
    public boolean verificarMascota(String identificacion) {
        boolean centinela = false;
        for (Mascota mascota : listaMascotas) {
            if (mascota.getIdentiifcacion().equals(identificacion)) {
                centinela = true;
            }
        }
        return centinela;
    }


    // Método: public boolean eliminarMacota(String identificacion)
    // Descripción: Explica la funcionalidad de este método
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

    // Método: public boolean agregarPersona(Persona persona)
    // Descripción: Explica la funcionalidad de este método
    public boolean agregarPersona(Persona persona) {
        boolean centinela = false;
        if (!verificarPersona(persona.getCorreo())){
            listaPersonas.add(persona);
            centinela = true;
        }
        return centinela;
    }

    // Método: public boolean verificarPersona(String correo)
    // Descripción: Explica la funcionalidad de este método
    public boolean verificarPersona(String correo) {
        boolean centinela = false;
        for (Persona persona: listaPersonas) {
            if (persona.getCorreo().equals(correo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    // Método: public boolean eliminarPersona(String correo)
    // Descripción: Explica la funcionalidad de este método
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

    // Método: public boolean agregarVeterinario(Veterinario veterinario)
    // Descripción: Explica la funcionalidad de este método
    public boolean agregarVeterinario(Veterinario veterinario) {
        boolean centinela = false;
        if (!verificarVeterinario(veterinario.getNumeroLicencia())){
            listaVeterinarios.add(veterinario);
            centinela = true;
        }
        return centinela;
    }

    // Método: public boolean verificarVeterinario(String licencia)
    // Descripción: Explica la funcionalidad de este método
    public boolean verificarVeterinario(String licencia) {
        boolean centinela = false;
        for (Veterinario veterinario: listaVeterinarios) {
            if (veterinario.getNumeroLicencia().equals(licencia)) {
                centinela = true;
            }
        }
        return centinela;
    }

    // Método: public boolean eliminarVeterinario(String licencia)
    // Descripción: Explica la funcionalidad de este método
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

    // Método: public boolean agregarPropietario(Propietario propietario)
    // Descripción: Explica la funcionalidad de este método
    public boolean agregarPropietario(Propietario propietario) {
        boolean centinela = false;
        if (!verificarPropietario(propietario.getDireccion())){
            listaPropietarios.add(propietario);
            centinela = true;
        }
        return centinela;
    }

    // Método: public boolean verificarPropietario(String direccion)
    // Descripción: Explica la funcionalidad de este método
    public boolean verificarPropietario(String direccion) {
        boolean centinela = false;
        for (Propietario propietario: listaPropietarios) {
            if (propietario.getDireccion().equals(direccion)) {
                centinela = true;
            }
        }
        return centinela;
    }

    // Método: public boolean eliminarPropietario(String direccion)
    // Descripción: Explica la funcionalidad de este método
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

    // Método: public ArrayList<Veterinario> getListaVeterinarios()
    // Descripción: Explica la funcionalidad de este método
    public ArrayList<Veterinario> getListaVeterinarios() {
        return listaVeterinarios;
    }

    // Método: public void setListaVeterinarios(ArrayList<Veterinario> listaVeterinarios)
    // Descripción: Explica la funcionalidad de este método
    public void setListaVeterinarios(ArrayList<Veterinario> listaVeterinarios) {
        this.listaVeterinarios = listaVeterinarios;
    }

    // Método: public ArrayList<Propietario> getListaPropietarios()
    // Descripción: Explica la funcionalidad de este método
    public ArrayList<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    // Método: public void setListaPropietarios(ArrayList<Propietario> listaPropietarios)
    // Descripción: Explica la funcionalidad de este método
    public void setListaPropietarios(ArrayList<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    // Método: public ArrayList<Persona> getListaPersonas()
    // Descripción: Explica la funcionalidad de este método
    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    // Método: public void setListaPersonas(ArrayList<Persona> listaPersonas)
    // Descripción: Explica la funcionalidad de este método
    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    // Método: public ArrayList<Mascota> getListaMascotas()
    // Descripción: Explica la funcionalidad de este método
    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    // Método: public void setListaMascotas(ArrayList<Mascota> listaMascotas)
    // Descripción: Explica la funcionalidad de este método
    public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    // Método: public ArrayList<Cita> getListaCitas()
    // Descripción: Explica la funcionalidad de este método
    public ArrayList<Cita> getListaCitas() {
        return listaCitas;
    }

    // Método: public void setListaCitas(ArrayList<Cita> listaCitas)
    // Descripción: Explica la funcionalidad de este método
    public void setListaCitas(ArrayList<Cita> listaCitas) {
        this.listaCitas = listaCitas;
    }

    // Método: public String getUbicacion()
    // Descripción: Explica la funcionalidad de este método
    public String getUbicacion() {
        return ubicacion;
    }

    // Método: public void setUbicacion(String ubicacion)
    // Descripción: Explica la funcionalidad de este método
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Método: public String getNombre()
    // Descripción: Explica la funcionalidad de este método
    public String getNombre() {
        return nombre;
    }

    // Método: public void setNombre(String nombre)
    // Descripción: Explica la funcionalidad de este método
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
