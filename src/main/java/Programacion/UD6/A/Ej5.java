package Programacion.UD6.A;

import java.text.MessageFormat;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[20];
        int acumulador = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(MessageFormat.format("Ingresar el numero {0}/{1}: ", i+1, numeros.length));
            numeros[i] = entrada.nextInt();
            acumulador += numeros[i];
        }
        System.out.println("La media de los valores es: " + (acumulador/numeros.length));
    }
}
