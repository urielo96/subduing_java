package PatonesDisenio.Singleton;

public class Logger {
    private static Logger instancia;

    // Constructor privado
    private Logger() {
        System.out.println("Logger inicializado");
    }

    // Método para obtener la instancia (versión simple)
    public static Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    // Método para registrar un mensaje
    public void log(String mensaje) {
        System.out.println("[LOG] " + mensaje);
    }
}
