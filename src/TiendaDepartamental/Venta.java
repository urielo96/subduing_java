package TiendaDepartamental;
import java.util.List;


public class Venta {
    private List<Producto> productos;
    private int cantidad;
    private Cliente cliente; // Asociación con Cliente Relación uno a muchos

    // Constructor para inicializar los atributos de la venta
    public Venta(List<Producto> productos, int cantidad, Cliente cliente) {
        this.productos = productos;
        this.cantidad = cantidad;
        this.cliente = cliente;
    }

    // Registrando una venta
    public void registrarVenta(List<Producto> productos, int cantidad, Cliente cliente) {
        this.productos = productos;
        this.cantidad = cantidad;
        this.cliente = cliente;

        // Imprimiendo detalles de la venta
        System.out.println("Venta registrada para el cliente: " + cliente.getNombre());
        System.out.println("Productos vendidos:");
        for (Producto producto : productos) {
            System.out.println("- " + producto.getNombre() + " (Cantidad: " + cantidad + ")");
        }
    }

    // Metodo para verificar stock
    public boolean verificarStock(Producto producto, int cantidad) {
        // Revisando si el stock del producto es suficiente
        if (producto.getStock() < cantidad) {
            System.out.println("No hay suficiente stock para el producto: " + producto.getNombre());
            return false;
        }
        return true;
    }

    // Método para calcular el total de la venta
    public double calcularTotal() {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * cantidad; // Asumiendo que el precio es por unidad
        }
        return total;
    }
}
