package co.edu.uniquindio.poo.centroveterinariofx.util;
import co.edu.uniquindio.poo.centroveterinariofx.model.Propietario;
import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;


public class Email {
    private static final String REMITENTE = "veterinariauqam@gmail.com";
    private static final String CLAVE = "lknj oafn flzx nsva";
    private static final String HOST = "smtp.gmail.com";
    private static final String PORT = "587";

    public static void enviarCorreo(String destinatario, String asunto, String cuerpo) throws Exception {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", HOST);
        props.put("mail.smtp.port", PORT);

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(REMITENTE, CLAVE);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(REMITENTE));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
        message.setSubject(asunto);
        message.setText(cuerpo);

        Transport.send(message);
    }

    public static void enviarConfirmacionRegistro(Propietario propietario) throws Exception {
        String asunto = "¡Bienvenido al Centro Veterinario AM!";

        StringBuilder cuerpo = new StringBuilder();
        cuerpo.append("Estimado/a ").append(propietario.getNombre()).append(" ").append(propietario.getApellido()).append(",\n\n");
        cuerpo.append("¡Gracias por registrarte en nuestro centro Veterinario!\n\n");
        cuerpo.append("Tus datos registrados son:\n");
        cuerpo.append("Nombre: ").append(propietario.getNombre()).append("\n");
        cuerpo.append("Apellido: ").append(propietario.getApellido()).append("\n");
        cuerpo.append("Correo: ").append(propietario.getCorreo()).append("\n");
        cuerpo.append("Teléfono: ").append(propietario.getTelefono()).append("\n");
        cuerpo.append("Direccion: ").append(propietario.getDireccion()).append("\n\n");



        cuerpo.append("Si tienes alguna pregunta, no dudes en contactarnos.\n\n");
        cuerpo.append("Atentamente,\n");
        cuerpo.append("El equipo del Centro Veterinario AM");

        enviarCorreo(propietario.getCorreo(), asunto, cuerpo.toString());
    }



}
