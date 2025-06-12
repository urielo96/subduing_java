package Relaciones;

    class Curso {
        private Profesor profesor;  // agregación

        Curso(Profesor profesor) {
            this.profesor = profesor;
        }

        void mostrarProfesor() {
            System.out.println("Profesor: " + profesor.nombre);
        }
    }


