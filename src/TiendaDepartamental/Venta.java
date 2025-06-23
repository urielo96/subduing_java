package TiendaDepartamental;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Venta {
    private Map<Producto, Integer> productosVendidos; // Usando un mapa para almacenar productos y sus cantidades
    private Cliente cliente;



    // Constructor para inicializar los atributos de la venta
    public Venta(Cliente cliente) {
        this.productosVendidos = new HashMap<>();
        this.cliente = cliente;
    }

    // Metodos para agregar productos a la venta
    public void agregarProducto(Producto producto, int cantidad) {
        // Verificando si el producto ya está en la venta
        if (productosVendidos.containsKey(producto)) {
            System.out.println("Producto ya agregado: " + producto.getNombre());
        } else {
            productosVendidos.put(producto, cantidad);
        }
    }

    // Verificar el stock de los productos antes de completar la venta
    public boolean verificarStock() {
        for (Map.Entry<Producto, Integer> entry : productosVendidos.entrySet()) {
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            if (producto.getStock() < cantidad) {
                System.out.println("Stock insuficiente para el producto: " + producto.getNombre());
                return false; // Stock insuficiente
            }
        }
        return true; // Stock suficiente
    }

    // Método para completar la venta
    public void completarVenta() {
        if (verificarStock()) {
            double total = 0.0;
            for (Map.Entry<Producto, Integer> entry : productosVendidos.entrySet()) {
                Producto producto = entry.getKey();
                int cantidad = entry.getValue();
                total += producto.getPrecio() * cantidad;
                // Reducir el stock del producto
                producto.setStock(producto.getStock() - cantidad);
            }
            System.out.println("Venta completada para el cliente: " + cliente.getNombre());
            System.out.println("Total a pagar: $" + total);
        } else {
            System.out.println("No se puede completar la venta debido a stock insuficiente.");
        }
    }

    // Método para mostrar los detalles de la venta
    public void mostrarVenta() {
        System.out.println("Cliente: " + cliente.getNombre() + " (" + cliente.getEmail() + ")");
        System.out.println("Productos vendidos:");
        double total = 0.0;
        for (Map.Entry<Producto, Integer> entry : productosVendidos.entrySet()) {
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            double subtotal = producto.getPrecio() * cantidad;
            System.out.println("- " + producto.getNombre() + " x" + cantidad + " ($" + producto.getPrecio() + " c/u) = $" + subtotal);
            total += subtotal;
        }
        System.out.println("Total de la venta: $" + total);
        System.out.println("-----------------------------");
    }

}
