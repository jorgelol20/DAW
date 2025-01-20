package Programacion.UD6_1.A;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número "+ (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println(Arrays.toString(numeros));
    }
}
