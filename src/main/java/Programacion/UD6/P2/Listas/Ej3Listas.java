package Programacion.UD6.P2.Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3Listas {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int tamanyioLista = 10;
        for (int i = 0; i < tamanyioLista; ) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            try {
                lista.add(sc.nextInt());
                i++;
            } catch (InputMismatchException e) {
                System.out.println("¡Introduce un número válido!");
                sc.nextLine();
            }

        }
        System.out.println("Lista original: " + lista);
        ArrayList<Integer> listaOrdenada = new ArrayList<Integer>(lista);
        Collections.sort(listaOrdenada);
        System.out.println("Lista ordenada de menor a mayor: " + listaOrdenada);

    }
}
