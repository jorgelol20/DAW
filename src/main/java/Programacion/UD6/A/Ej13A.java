package Programacion.UD6.A;

import java.util.Arrays;
import java.util.Scanner;

public class Ej13A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor inicial: ");
        int valor = sc.nextInt();
        System.out.print("Introduce los incrementos: ");
        int incrementos = sc.nextInt();
        System.out.print("Introduce cuantos números quieres recibir de la cadena: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = valor;
            valor += incrementos;
        }
        System.out.println(Arrays.toString(array));
    }
}
