package Static;

public class MainStatic{
    public static void main(String[] args) {
        EjemploSimple unEjemploSimple = new EjemploSimple(); // Este es un objeto de ejmplo simple

        EjemploIntermedio unEjemploIntermedio = new EjemploIntermedio();

        //Accdamos a los atributos

        System.out.println(unEjemploIntermedio.total);

        System.out.println(unEjemploIntermedio.individual);

        // Ahora vamos a crear otro objeto y veamos que pasa

        EjemploIntermedio otroObjetoIntermedio = new EjemploIntermedio();

        System.out.println(unEjemploIntermedio.total);

        System.out.println(unEjemploIntermedio.individual);

        EjemploIntermedio otroMasObjetoIntermedio = new EjemploIntermedio();

        System.out.println(unEjemploIntermedio.total);

        System.out.println(unEjemploIntermedio.individual);



    }
}
