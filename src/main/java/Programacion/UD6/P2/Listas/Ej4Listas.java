package Programacion.UD6.P2.Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej4Listas {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int tamanyoLista = 10;
        for (int i = 0; i < tamanyoLista; i++) {
            System.out.print("Introduce la palabra numero "+(i+1)+": ");
            lista.add(sc.next());
        }
        ArrayList<String> listaOrdenada = new ArrayList<String>(lista);
        Collections.sort(listaOrdenada);
        System.out.println("Lista original: " + lista);
        System.out.println("Lista ordenada de menor a mayor: " + listaOrdenada);
    }
}
