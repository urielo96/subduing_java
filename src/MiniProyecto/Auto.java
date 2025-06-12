package MiniProyecto;

public class Auto
{
    public  String nombre;
    private  Motor motor; // Composición

    public Auto(String nombre,Motor motor) {
        this.nombre = nombre;
        this.motor = motor;
    }

    public void arrancar(){
        motor.encender();
        System.out.println("El auto esta arrancado");
    }
}
