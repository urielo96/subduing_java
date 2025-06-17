package PatonesDisenio.Singleton;

public class MainSingleton {
    public static void main(String[] args) {
        // 1.- Crear la instancia del Singleton
        Singleton singleton = Singleton.getInstancia();

        // 2.- Llamar al método de ejemplo
        singleton.saludar();

        // 3.- Intentar crear otra instancia (no se puede, ya que el constructor es privado)
        Singleton otroSingleton = Singleton.getInstancia();

        // 4.- Verificar que ambas instancias son iguales
        System.out.println("¿Son las mismas instancias? " + (singleton == otroSingleton));

        // 5.- Llamar al método de ejemplo de la otra instancia
        otroSingleton.saludar();

        // Logger ejemplo
        Logger logger1 = Logger.getInstancia();
        logger1.log("Inicio del programa");

        Logger logger2 = Logger.getInstancia();
        logger2.log("Segunda llamada al logger");

        // Verificamos que ambas variables apuntan al mismo objeto
        System.out.println("¿Es la misma instancia? " + (logger1 == logger2));
    }
}
