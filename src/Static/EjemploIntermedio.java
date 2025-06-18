package Static;

public class EjemploIntermedio {

    static int total = 0;
    int individual = 0;

    public  EjemploIntermedio(){
        total++;  // Cada que mande a llamar al costructor este se va aumenta
        individual++; // Este va a aumentar la variable individual ( Esta no es Static)
    }

    // Tambien podemos crear un metodo estatico
    static void metodoEstatico() {
        System.out.println("Este es un ejemplo de un metodo estatico");
    }



}

