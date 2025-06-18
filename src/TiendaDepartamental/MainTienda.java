package TiendaDepartamental;

public class MainTienda {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente0 = new Cliente();

        //Registrar un cliente
        cliente0.registrarCliente("Juan Perez", "juan@gamil.com");

        // Mostrar los datos del cliente
        System.out.println("Cliente registrado: " + cliente0.getNombre());
        System.out.println("Email del cliente: " + cliente0.getEmail());

    }
}
