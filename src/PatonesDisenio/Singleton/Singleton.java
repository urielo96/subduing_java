package PatonesDisenio.Singleton;

// Ejemplo de un Singleton en Java
// Asi se veria una estructura de un Singleton en Java

public class Singleton {
    // 1.- Crearla única instancia ( inicializacion perezosa)
    private static Singleton instancia;
     // 2. Constructor PRIVADO para evistar que se instancie des fuera
    private Singleton(){
        System.out.println("Instancia creada");
    }

    // 3. Hacer un método público para poder acceder a la instancia
    public static Singleton getInstancia(){
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;

    }

    // 4. Crear  un método de eujemplo
    public void saludar(){
        System.out.println("Hola desde un singleton");
    }

}
