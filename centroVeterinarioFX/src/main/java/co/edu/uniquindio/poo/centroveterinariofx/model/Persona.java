package co.edu.uniquindio.poo.centroveterinariofx.model;

public abstract class Persona {
    public String nombre;
    public String apellido;
    public String telefono;
    public String correo;

    // Método: public Persona(String nombre, String apellido, String telefono, String correo)
    // Descripción: Explica la funcionalidad de este método
    public Persona(String nombre, String apellido, String telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
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

    // Método: public String getApellido()
    // Descripción: Explica la funcionalidad de este método
    public String getApellido() {
        return apellido;
    }

    // Método: public void setApellido(String apellido)
    // Descripción: Explica la funcionalidad de este método
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Método: public String getTelefono()
    // Descripción: Explica la funcionalidad de este método
    public String getTelefono() {
        return telefono;
    }

    // Método: public void setTelefono(String telefono)
    // Descripción: Explica la funcionalidad de este método
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método: public String getCorreo()
    // Descripción: Explica la funcionalidad de este método
    public String getCorreo() {
        return correo;
    }

    // Método: public void setCorreo(String correo)
    // Descripción: Explica la funcionalidad de este método
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
