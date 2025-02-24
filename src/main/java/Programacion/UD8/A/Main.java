package Programacion.UD8.A;

import Programacion.UD8.ENUMERADOS.Enumerados;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona una opcion");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            instanciarPersona();
        }else if (opcion == 2) {
            instanciarArticulo();
        }else{
            System.out.println("Opcion no valida");
        }
    }
    private static void instanciarPersona(){
        Persona persona = new Persona();
        persona.dni = "00000000A";
        persona.nombre = "Jose";
        persona.apellidos = "Martinez";
        persona.edad = 21;
        persona.genero = Enumerados.Genero.ESTUDIANTE_DE_BELLAS_ARTES;
        persona.nacionalidad = Enumerados.Nacionalidad.BRITANICO;
        persona.mostrarDatos();

    }
    public static void instanciarArticulo(){
        Articulo articulo = new Articulo();
        articulo.nombreArticulo = "Pijama";
        articulo.precio = 10;
        articulo.cuantosQuedan = 10;
        articulo.mostrarArticulo();

    }
}
