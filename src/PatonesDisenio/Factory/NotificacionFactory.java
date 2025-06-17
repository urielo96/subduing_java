package PatonesDisenio.Factory;

public class NotificacionFactory {
    public static Notificacion crear(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "email" -> new NotificacionEmail();
            case "sms" -> new NotificacionSms();
            case "push" -> new NotificacionPush();
            default -> throw new IllegalArgumentException("Tipo no soportado");
        };
    }
}
