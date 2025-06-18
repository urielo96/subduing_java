package Relaciones.MiniProyecto;

import java.util.ArrayList;
import java.util.List;

public class Usuario
{
    private String nombre;
    private List<Auto> autos;  //Agregación puede tener varios autos

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }

    public void agregarAuto(Auto auto){
        autos.add(auto);
    }

    public void getNameAuto(){
        for (Auto auto : autos){
            System.out.println("El usuario tiene un vehiculo" + auto.nombre);
        }
    }

    public void arrancarAutos(){
        System.out.println("El usuario : " + nombre  +  "esta arrancando sus autos");
        for( Auto auto : autos){
            auto.arrancar();

        }


    }
    public void generarReporte(Reporte reporte) {
        // dependencia: solo usa Reporte dentro de este método
        reporte.imprimir();
    }


}
