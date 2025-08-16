package co.edu.uniquindio.poo.centroveterinariofx.model;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
class CentroVeterinarioTest {
    private static final Logger LOG = Logger.getLogger(CentroVeterinarioTest.class.getName());



    @Test
    void verificarAveriguarCitasDiatest() {
        LOG.info("Se ha iniciado la prueba");
        CentroVeterinario prueba1= new CentroVeterinario("ATM" , "Armenia");
        Propietario propietario1= new Propietario("Valeria","Perez", "3106340575", "valeria15@gmail.com","Armenia");
        Mascota mascota1= new Mascota("Barbie" , "Persia" , 3,"123", Especie.GATO , propietario1 );
        Veterinario veterinario1 = new Veterinario("Maria", "Medina", "3215556482", "maria45@gmailcom" , "5654" , Especialidad.ANIMALESPEQUEÑOS);
        Cita cita1 = new Cita("22/2025/08","4:30pm", mascota1, veterinario1);
        Cita cita2 = new Cita("28/2025/08","5:30pm", mascota1, veterinario1);

        prueba1.agregarCita(cita1);
        prueba1.agregarCita(cita2);
        prueba1.averiguarCitasDia("22/2025/08");
        int cantidad =1;
        int cantidadDia= prueba1.averiguarCitasDia("22/2025/08").size();


        assertEquals(cantidad,cantidadDia);
        LOG.info("Se termino la prueba");
    }

    @Test
    void agregarMascota() {
        LOG.info("Se ha iniciado la prueba agregarMascota");
        CentroVeterinario centro = new CentroVeterinario("VetUni", "Calle 123");
        Propietario propietario = new Propietario("Juan", "Perez", "123456", "juan@mail.com", "Calle 1");
        Historial historial = new Historial();
        Consulta consulta = new Consulta("Vacuna", "Sano", null, historial);
        Mascota mascota = new Mascota("Firulais", "Labrador", 3, "M001", Especie.PERRO, propietario);
        boolean resultado = centro.agregarMascota(mascota);
        assertTrue(resultado);
        assertTrue(centro.verificarMascota("M001"));
        LOG.info("Se ha terminado la prueba agregarMascota");
    }

    @Test
    void verificarMascota() {
        LOG.info("Se ha iniciado la prueba verificarMascota");
        CentroVeterinario centro = new CentroVeterinario("VetUni", "Calle 123");
        Propietario propietario = new Propietario("Ana", "Lopez", "654321", "ana@mail.com", "Calle 2");
        Historial historial = new Historial();
        Consulta consulta = new Consulta("Chequeo", "Bien", null, historial);
        Mascota mascota = new Mascota("Mimi", "Siames", 2, "M002", Especie.GATO, propietario);
        centro.agregarMascota(mascota);
        assertTrue(centro.verificarMascota("M002"));
        assertFalse(centro.verificarMascota("M999"));
        LOG.info("Se ha terminado la prueba verificarMascota");
    }

    @Test
    void eliminarMacota() {
        LOG.info("Se ha iniciado la prueba eliminarMacota");
        CentroVeterinario centro = new CentroVeterinario("VetUni", "Calle 123");
        Propietario propietario = new Propietario("Luis", "Martinez", "789123", "luis@mail.com", "Calle 3");
        Historial historial = new Historial();
        Consulta consulta = new Consulta("Desparasitacion", "Ok", null, historial);
        Mascota mascota = new Mascota("Rocky", "Bulldog", 4, "M003", Especie.PERRO, propietario);
        centro.agregarMascota(mascota);
        boolean eliminado = centro.eliminarMacota("M003");
        assertTrue(eliminado);
        assertFalse(centro.verificarMascota("M003"));
        LOG.info("Se ha terminado la prueba eliminarMacota");
    }

    @Test
    void agregarPersona() {
        LOG.info("Se ha iniciado la prueba agregarPersona");
        CentroVeterinario centro = new CentroVeterinario("VetUni", "Calle 123");
        Veterinario persona = new Veterinario("Carlos", "Ramirez", "321654", "carlos@mail.com", "LIC123", Especialidad.ANIMALESGRANDES);
        boolean resultado = centro.agregarPersona(persona);
        assertTrue(resultado);
        assertTrue(centro.verificarPersona("carlos@mail.com"));
        LOG.info("Se ha terminado la prueba agregarPersona");
    }

    @Test
    void verificarPersona() {
        LOG.info("Se ha iniciado la prueba verificarPersona");
        CentroVeterinario centro = new CentroVeterinario("VetUni", "Calle 123");
        Propietario persona = new Propietario("Maria", "Gomez", "987654", "maria@mail.com", "Calle 4");
        centro.agregarPersona(persona);
        assertTrue(centro.verificarPersona("maria@mail.com"));
        assertFalse(centro.verificarPersona("noexiste@mail.com"));
        LOG.info("Se ha terminado la prueba verificarPersona");
    }

    @Test
    void eliminarPersona() {
        LOG.info("Se ha iniciado la prueba eliminarPersona");
        CentroVeterinario centro = new CentroVeterinario("VetUni", "Calle 123");
        Propietario persona = new Propietario("Pedro", "Diaz", "456789", "pedro@mail.com", "Calle 5");
        centro.agregarPersona(persona);
        boolean eliminado = centro.eliminarPersona("pedro@mail.com");
        assertTrue(eliminado);
        assertFalse(centro.verificarPersona("pedro@mail.com"));
        LOG.info("Se ha terminado la prueba eliminarPersona");
    }

    @Test
    void agregarVeterinario() {
        LOG.info("Se ha iniciado la prueba agregarVeterinario");
        CentroVeterinario centro = new CentroVeterinario("VetUni", "Calle 123");
        Veterinario veterinario = new Veterinario("Laura", "Sanchez", "147258", "laura@mail.com", "LIC456", Especialidad.ANIMALESPEQUEÑOS);
        boolean resultado = centro.agregarVeterinario(veterinario);
        assertTrue(resultado);
        assertTrue(centro.verificarVeterinario("LIC456"));
        LOG.info("Se ha terminado la prueba agregarVeterinario");
    }

    @Test
    void verificarVeterinario() {
        LOG.info("Se ha iniciado la prueba verificarVeterinario");
        CentroVeterinario centro = new CentroVeterinario("VetUni", "Calle 123");
        Veterinario veterinario = new Veterinario("Sofia", "Morales", "369258", "sofia@mail.com", "LIC789", Especialidad.ANIMALESEXOTICOS);
        centro.agregarVeterinario(veterinario);
        assertTrue(centro.verificarVeterinario("LIC789"));
        assertFalse(centro.verificarVeterinario("LIC000"));
        LOG.info("Se ha terminado la prueba verificarVeterinario");
    }

    @Test
    void eliminarVeterinario() {
        LOG.info("Se ha iniciado la prueba eliminarVeterinario");
        CentroVeterinario centro = new CentroVeterinario("VetUni", "Calle 123");
        Veterinario veterinario = new Veterinario("Miguel", "Torres", "258369", "miguel@mail.com", "LIC321", Especialidad.ANIMALESGRANDES);
        centro.agregarVeterinario(veterinario);
        boolean eliminado = centro.eliminarVeterinario("LIC321");
        assertTrue(eliminado);
        assertFalse(centro.verificarVeterinario("LIC321"));
        LOG.info("Se ha terminado la prueba eliminarVeterinario");
    }

    @Test
    void agregarPropietario() {
        LOG.info("Se ha iniciado la prueba agregarPropietario");
        CentroVeterinario centro = new CentroVeterinario("VetUni", "Calle 123");
        Propietario propietario = new Propietario("Andrea", "Rios", "753159", "andrea@mail.com", "Calle 6");
        boolean resultado = centro.agregarPropietario(propietario);
        assertTrue(resultado);
        assertTrue(centro.verificarPropietario("Calle 6"));
        LOG.info("Se ha terminado la prueba agregarPropietario");
    }

    @Test
    void verificarPropietario() {
        LOG.info("Se ha iniciado la prueba verificarPropietario");
        CentroVeterinario centro = new CentroVeterinario("VetUni", "Calle 123");
        Propietario propietario = new Propietario("Camilo", "Vega", "951753", "camilo@mail.com", "Calle 7");
        centro.agregarPropietario(propietario);
        assertTrue(centro.verificarPropietario("Calle 7"));
        assertFalse(centro.verificarPropietario("Calle 999"));
        LOG.info("Se ha terminado la prueba verificarPropietario");
    }

    @Test
    void eliminarPropietario() {
        LOG.info("Se ha iniciado la prueba eliminarPropietario");
        CentroVeterinario centro = new CentroVeterinario("VetUni", "Calle 123");
        Propietario propietario = new Propietario("Esteban", "Mora", "357159", "esteban@mail.com", "Calle 8");
        centro.agregarPropietario(propietario);
        boolean eliminado = centro.eliminarPropietario("Calle 8");
        assertTrue(eliminado);
        assertFalse(centro.verificarPropietario("Calle 8"));
        LOG.info("Se ha terminado la prueba eliminarPropietario");
    }

}