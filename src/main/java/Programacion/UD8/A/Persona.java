package Programacion.UD8.A;

import Programacion.UD8.ENUMERADOS.Enumerados;

public class Persona {
    String dni;
    String nombre;
    String apellidos;
    int edad;
    Enumerados.Genero genero;
    Enumerados.Nacionalidad nacionalidad;

    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
        System.out.println("Nacionalidad: " + nacionalidad);
    }
}
