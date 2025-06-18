package PatonesDisenio.Factory_01;

public class NotificacionPush implements  Notificacion{
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación por Push: " + mensaje);
    }
}
