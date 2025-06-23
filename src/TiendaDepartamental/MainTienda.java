package TiendaDepartamental;

public class MainTienda {
    public static void main(String[] args) {


        // Creamos un cliente
        Cliente cliente = new Cliente ();

        // Registramos al cliente

        cliente.registrarCliente("Juan Perez", "juan@gmail.com");

        // Mostramos los datos del cliente
        cliente.mostrarDatos();

        // Creeemos 3 productos

        Producto producto1 = new Producto("Camisa", 29.99, "Ropa", 100);
        Producto producto2 = new Producto("Pantalón", 49.99, "Ropa", 50);
        Producto producto3 = new Producto("Zapatos", 89.99, "Calzado", 30);


        // Creamos una venta
        Venta venta = new Venta(cliente);

        // Agregamos productos a la venta
        venta.agregarProducto(producto1,5);
        venta.agregarProducto(producto2,3);
        venta.agregarProducto(producto3,20000);

        // Verificamos el stock de los productos
        System.out.println("Verificando stock de productos..."  + venta.verificarStock());

        // Completamos la venta

        venta.completarVenta();





    }
}
