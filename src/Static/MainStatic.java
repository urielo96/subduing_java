package Static;

public class MainStatic{
    public static void main(String[] args) {
        EjemploSimple unEjemploSimple = new EjemploSimple(); // Este es un objeto de ejmplo simple

        EjemploIntermedio unEjemploIntermedio = new EjemploIntermedio();

        //Accedamos a los atributos

        //Instanciamos un objeto

        System.out.println("Esta es una variable estatica que pertenece a la clase " +unEjemploIntermedio.total);

        System.out.println("Este solo pertence al objeto " + unEjemploIntermedio.individual);



        // Ahora vamos a crear otro objeto y veamos que pasa

        EjemploIntermedio otroObjetoIntermedio = new EjemploIntermedio();

        System.out.println(unEjemploIntermedio.total);

        System.out.println(unEjemploIntermedio.individual);


        // Tercer Instancia

        EjemploIntermedio otroMasObjetoIntermedio = new EjemploIntermedio();

        System.out.println(unEjemploIntermedio.total);

        System.out.println(unEjemploIntermedio.individual);

        // Cada vez que se crea un objeto de EjemploIntermedio, el total aumenta, pero el individual no, porque es una variable de instancia.

        //Un metodo estatico se puede llamar sin necesidad de crear un objeto de la clase
        //Lógica independiente de instancias: Cuando el método no necesita acceder ni modificar el estado de un objeto (atributos de instancia). Ejemplo: métodos de utilidad como cálculos matemáticos (Math.sqrt()).
        //Funciones compartidas: Cuando el comportamiento es común a todas las instancias de la clase y no depende de datos específicos de un objeto. Ejemplo: un contador global.
        //Mejor rendimiento: Los métodos estáticos pueden ser más rápidos porque no requieren la creación de un objeto.
        //Acceso directo: Cuando necesitas llamar al método sin crear instancias, como en clases de utilidades (Collections.sort()).
        // Constantes o configuraciones globales: Para definir lógica asociada a valores constantes o configuraciones globales.

        EjemploIntermedio.metodoEstatico(); // Llamamos al metodo estatico

        System.out.println(); // Llamamos a un metodo estatico de la clase Math

        int numeroAleatorio = (int)(Math.random() * 100) + 1; // Auí podemos ver que Math es una clase que tiene metodos estaticos y no ha necesidad de crear un objeto de la clase Math para acceder a sus metodos estaticos.
        System.out.println(numeroAleatorio);


    }
}
