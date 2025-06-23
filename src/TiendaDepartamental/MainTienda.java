package TiendaDepartamental;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTienda {
    public static void main(String[] args) {


        // Creamos un cliente
        //Cliente cliente = new Cliente ();

        // Registramos al cliente

        //cliente.registrarCliente("Juan Perez", "juan@gmail.com");

        // Mostramos los datos del cliente
        //cliente.mostrarDatos();

        // Creeemos 3 productos

        Producto producto1 = new Producto("Camisa", 29.99, "Ropa", 100);
        Producto producto2 = new Producto("Pantalón", 49.99, "Ropa", 50);
        Producto producto3 = new Producto("Zapatos", 89.99, "Calzado", 30);


        // Creamos una venta
        //Venta venta = new Venta(cliente);

        //// Agregamos productos a la venta
        //venta.agregarProducto(producto1,5);
        //venta.agregarProducto(producto2,3);
        //venta.agregarProducto(producto3,20000);

        // Verificamos el stock de los productos
        //System.out.println("Verificando stock de productos..."  + venta.verificarStock());

        // Completamos la venta

        //venta.completarVenta();
        // Listas para almacenar clientes, productos y ventas
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Venta> ventas = new ArrayList<>();

        // Vamos a ocuparlo como si fueramos punto de venta

        String userMessage = "";
        Scanner sacanner = new Scanner(System.in);
        System.out.println("Bienvienido al punto de venta de la Escuela de Código");

        do {
            System.out.println("Escriba el número de a opcion que desea");
            System.out.println("""
                    1. Agregar un cliente
                    2. Agregar un producto
                    3. Registrar un venta 
                    4. Salir """);
            userMessage = sacanner.nextLine();

            switch (userMessage){
                case "1":
                    System.out.println("Registra al cliente");
                    System.out.println("Ingrese el nombre del cliente");
                    String nombre = sacanner.nextLine();
                    System.out.println("Ingrese el correo del cliente");
                    String correo = sacanner.nextLine();
                    Cliente cliente = new Cliente();
                    cliente.registrarCliente(nombre,correo);
                    clientes.add(cliente);
                    System.out.println("Cliente agregado: " + cliente.getNombre());
                    break;
                case  "2":
                    System.out.println("Agrega un producto");
                    System.out.println("Ingrese el nombre del producto");
                    String nombreProducto = sacanner.nextLine();
                    System.out.println("Ingrese el precio del producto");
                    double precioProducto = Double.parseDouble(sacanner.nextLine());
                    System.out.println("Ingrese la categoria del producto");
                    String categoriaProducto = sacanner.nextLine();
                    System.out.println("Ingrese la cantidad del producto");
                    int cantidadProducto = Integer.parseInt(sacanner.nextLine());
                    Producto producto = new Producto(nombreProducto, precioProducto, categoriaProducto, cantidadProducto);
                    productos.add(producto);
                    System.out.println("Producto agregado: " + producto.getNombre());
                    break;
                case "3":
                    System.out.println("Registremos una venta");
                    if (clientes.isEmpty()) {
                        System.out.println("No hay clientes registrados. Agregue un cliente primero.");
                        break;
                    }
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos registrados. Agregue un producto primero.");
                        break;
                    }
                    // Seleccionar cliente
                    System.out.println("Seleccione el cliente por número:");
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println((i+1) + ". " + clientes.get(i).getNombre());
                    }
                    int idxCliente = Integer.parseInt(sacanner.nextLine()) - 1;
                    Cliente clienteVenta = clientes.get(idxCliente);
                    Venta ventaNueva = new Venta(clienteVenta);
                    // Seleccionar productos
                    String agregarOtro;
                    do {
                        System.out.println("Seleccione el producto por número:");
                        for (int i = 0; i < productos.size(); i++) {
                            System.out.println((i+1) + ". " + productos.get(i).getNombre() + " (Stock: " + productos.get(i).getStock() + ")");
                        }
                        int idxProducto = Integer.parseInt(sacanner.nextLine()) - 1;
                        Producto prodSeleccionado = productos.get(idxProducto);
                        System.out.println("Ingrese la cantidad a vender:");
                        int cantidad = Integer.parseInt(sacanner.nextLine());
                        if (cantidad > prodSeleccionado.getStock()) {
                            System.out.println("No hay suficiente stock. Stock disponible: " + prodSeleccionado.getStock());
                        } else {
                            ventaNueva.agregarProducto(prodSeleccionado, cantidad);
                            prodSeleccionado.setStock(prodSeleccionado.getStock() - cantidad);
                            System.out.println("Producto agregado a la venta.");
                        }
                        System.out.println("¿Agregar otro producto a la venta? (s/n)");
                        agregarOtro = sacanner.nextLine();
                    } while (agregarOtro.equalsIgnoreCase("s"));
                    ventaNueva.completarVenta();
                    ventas.add(ventaNueva);
                    System.out.println("Venta registrada exitosamente.");
                    break;
                case "4":
                    System.out.println("Ventas realizadas:");
                    if (ventas.isEmpty()) {
                        System.out.println("No hay ventas registradas.");
                    } else {
                        for (int i = 0; i < ventas.size(); i++) {
                            System.out.println("Venta " + (i+1) + ":");
                            ventas.get(i).mostrarVenta();
                        }
                    }
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");

            }




        }while (!userMessage.equals("4"));




    }
}
