package Static;

// Static se refiere a que la el atributo o metodo pertenence a la clase no al objetoo
// Es decir cuando nosotros instanciamos una clase el atributo pertenece al objeto en este caso no el atributo
// pertenece a la clase . Todos los objetos que sean creado de esa clase van a compartir ese mtodo o atributo


// Esto es un ejemplo báscio de como se poner la palbara static
public class EjemploSimple {

    static  int numeroCompartido ;

    // Constructor
    public EjemploSimple() {
    }

    // Metodos

    static void metodoEstaitco(){
        System.out.println("Este es un ejemplo de método estático");
    }

    void metodoNormal(){
        System.out.println("Este es un ejemplo de un metodo normal");
    }
}
