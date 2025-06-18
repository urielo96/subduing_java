package PatonesDisenio.Factory_01;

public class NotificacionEmail implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación por email: " + mensaje);
    }
}
