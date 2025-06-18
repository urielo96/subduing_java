package PatonesDisenio.Factory_01;

public class MainFactory {
    public static void main(String[] args) {

        // Usar la factory para crear notificaciones

        NotificacionFactory.crear("email");

        NotificacionFactory.crear("sms");

        NotificacionFactory.crear("push");

        // Intentar crear una notificación de un tipo no soportado

        NotificacionFactory.crear("fax"); // Esto lanzará una excepción


    }
}
