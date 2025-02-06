package Programacion.UD6.P2.Mapas;

import java.util.*;

public class Ej14Mapas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> jugadoresRol = new ArrayList<String[]>();
        while(true) {
            System.out.println("Ingrese el nombre del personaje\n(Escribe \"salir\") para salir):");
            String nombrePersonaje = sc.nextLine();
            if(nombrePersonaje.equalsIgnoreCase("salir")) {
                break;
            }else{
                System.out.println("Ingrese sus atributos:");
                System.out.print("Inteligencia: ");
                int atributoInteligencia = sc.nextInt();
                System.out.print("Destreza: ");
                int atributoDestreza = sc.nextInt();
                System.out.print("Fuerza: ");
                int atributoFuerza = sc.nextInt();
                sc.nextLine();
                String[] atributosPersonaje = {("inteligencia="+atributoInteligencia),"destreza="+atributoDestreza,"fuerza="+atributoFuerza};
                System.out.print("Introduce la clase del personaje: ");
                String clasePersonaje = sc.nextLine();
                String[] personaje = {"nombre="+nombrePersonaje,"atributos="+ Arrays.toString(atributosPersonaje),"clase="+clasePersonaje};
                jugadoresRol.add(personaje);
            }
        }
        for (String[] key: jugadoresRol) {
            System.out.println(Arrays.toString(key));
        }
        System.out.println("El mejor jugador es...");
        String[] mejorJugador = null;
        for (String[] key: jugadoresRol) {
            String atributosPersonaje = key[1];
            String[] separador =  atributosPersonaje.split("=");
            System.out.println(Arrays.toString(separador));
            String sumaAtributos = String.valueOf(Integer.parseInt(separador[2].charAt(0)+"")+Integer.parseInt(separador[4].charAt(0)+"")+Integer.parseInt(separador[5].charAt(0)+""));
            System.out.println(sumaAtributos);
        }
    }
}
