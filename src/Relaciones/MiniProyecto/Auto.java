package Relaciones.MiniProyecto;

public class Auto {
    public String nombre;
    private MotorElectrico motor;

    public Auto(String nombre) {
        this.nombre = nombre;
        this.motor = new MotorElectrico(); // El auto crea su motor internamente por lo tanto aqui es ta la composicion
    }

    public void arrancar() {
        motor.encender();
        System.out.println("El auto está arrancado");
    }
}


// Esto seria un forma diferente de hacer una composicion no
//public class Auto
//{
//    public  String nombre;
//    private  Motor motor; //
//
//    public Auto(String nombre,Motor motor) {
//        this.nombre = nombre;
//        this.motor = motor;
//    }
//
//    public void arrancar(){
//        motor.encender();
//        System.out.println("El auto esta arrancado");
//    }
//}