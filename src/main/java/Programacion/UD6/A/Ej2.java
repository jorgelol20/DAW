package Programacion.UD6.A;

import java.text.MessageFormat;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int acumulador = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(MessageFormat.format("Ingresar el numero {0}/{1}: ", i+1, numeros.length));
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            acumulador += numeros[i];
        }
        System.out.println("La suma de los números es: " + acumulador);
    }
}
