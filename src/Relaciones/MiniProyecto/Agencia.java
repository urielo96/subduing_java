package Relaciones.MiniProyecto;

public class Agencia{
    public static void main(String[] args) {

        // Creamis un usuario
        Usuario usuario = new Usuario("Diego");

        // Instanciamos 2 tipos de motores
        MotorElectrico motorElectrico = new MotorElectrico();

        MotorGasolina motorGasolina = new MotorGasolina();

        // Creamos dos autos con diferentes motores
        Auto tesla = new Auto("Tesla",motorElectrico);

        Auto mustang = new Auto("Mustang",motorGasolina);

        // Agregamos los autos al usuario
        usuario.agregarAuto(tesla);

        usuario.agregarAuto(mustang);

        // Mostramos los autos del usuario

        usuario.arrancarAutos();

        Reporte reporte = new Reporte();

        usuario.generarReporte(reporte);

        usuario.getNameAuto();



    }

    }

