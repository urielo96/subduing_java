package PatonesDisenio.Factory;

public class NotificacionPush implements  Notificacion{
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación por Push: " + mensaje);
    }
}
