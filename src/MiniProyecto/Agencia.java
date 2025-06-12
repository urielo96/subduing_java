package MiniProyecto;

public class Agencia{
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Diego");

        MotorElectrico motorElectrico = new MotorElectrico();

        MotorGasolina motorGasolina = new MotorGasolina();

        Auto tesla = new Auto("Tesla",motorElectrico);

        Auto mustang = new Auto("Mustang",motorGasolina);

        usuario.agregarAuto(tesla);

        usuario.agregarAuto(mustang);

        usuario.arrancarAutos();

        Reporte reporte = new Reporte();

        usuario.generarReporte(reporte);

        usuario.getNameAuto();



    }

    }

