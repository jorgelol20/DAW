package Programacion.UD10;

import java.util.*;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int cantidadElementos = (int) (Math.random() * (10 - 1)+1);
        HashSet<Integer> conjuntoElementos = new HashSet<>();
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        for(int i = 0; i < cantidadElementos; i++) {
            conjuntoElementos.add((int) (Math.random() * (100)+1));
        }
        boolean salir = false;
        while(!salir) {
            try {
                System.out.println("Introduce un número (negativo para salir): ");
                int numero = sc.nextInt();
                if(numero >= 0) {
                    listaNumeros.add(numero);
                }else{
                    salir = true;
                }
            }catch (InputMismatchException e){
                System.out.println("Valor no válido");
                sc.nextLine();
            }
        }
        mostrarInterseccion(conjuntoElementos, listaNumeros);

    }
    private static void mostrarInterseccion(HashSet<Integer> conjuntoElementos, ArrayList<Integer> listaNumeros) {
        TreeSet<Integer> interseccion = new TreeSet<>();
        for(Integer numero : conjuntoElementos) {
            if(listaNumeros.contains(numero)) {
                interseccion.add(numero);
            }
        }
        if(interseccion.isEmpty()) {
            System.out.println("No intersecciona ningún valor");
        }else {
            System.out.println("Conjunto aleatorio: " + conjuntoElementos);
            System.out.println("Valores del usuario: " + listaNumeros);
            System.out.println("Intersecciones: " + interseccion);
        }
    }
}
