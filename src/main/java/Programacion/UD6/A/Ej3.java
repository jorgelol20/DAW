package Programacion.UD6.A;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(MessageFormat.format("Ingresar el numero {0}/{1}: ", i+1, numeros.length));
            numeros[i] = sc.nextInt();
        }
        numeros = Arrays.stream(numeros).sorted().toArray();
        System.out.println(MessageFormat.format("El número mímimo es {0} y el máximo {1}", numeros[0], numeros[numeros.length-1]));

    }
}
