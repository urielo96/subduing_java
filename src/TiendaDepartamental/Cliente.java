package TiendaDepartamental;

public class Cliente  {
    private String nombre;
    private String email;


    // Constructor para inicializar los atributos del cliente
    public Cliente() {}

    // Método para registrar un cliente
    public void registrarCliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para mostrar los datos del cliente
    public void mostrarDatos() {
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Email del cliente: " + email);
    }
}
