package PatonesDisenio.Factory_01;

public class NotificacionSms implements Notificacion{
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación por SMS: " + mensaje);
    }
}
