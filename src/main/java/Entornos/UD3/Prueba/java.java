package Entornos.UD3.Prueba;
public class java {
    public class Persona {
        private String nombre;
        private int edad;
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        public String getNombre() {
            return nombre;
        }
        public int getEdad() {
            return edad;
        }
    }
    public class Estudiante extends Persona {
        private String carrera;
        public Estudiante(String nombre, int edad, String carrera) {
            super(nombre, edad);
            this.carrera = carrera;
        }
        public String getCarrera() {
            return carrera;
        }
    }
    public class Profesor extends Persona {
        private String materia;
        public Profesor(String nombre, int edad, String materia) {
            super(nombre, edad);
            this.materia = materia;
        }
        public String getMateria() {
            return materia;
        }
    }
}
