package Programacion.UD6.A;

import java.text.MessageFormat;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[20];
        int acumNeg = 0;
        int acumPos = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(MessageFormat.format("Ingresar el numero {0}/{1}: ", i+1, numeros.length));
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                acumNeg += numeros[i];
            }else{
                acumPos += numeros[i];
            }
        }
        System.out.println("Suma positivos: " + acumPos);
        System.out.println("Suma negativos: " + acumNeg);
    }
}
