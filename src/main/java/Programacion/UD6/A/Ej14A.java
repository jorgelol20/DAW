package Programacion.UD6.A;

import java.util.Arrays;

public class Ej14A {
    public static void main(String[] args) {
        int numeros = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                numeros++;
            }
        }
        int[] array = new int[numeros];
        int conNum = 1;
        int veces = 0;
        for (int i = 0; i < array.length; i++) {
            if (veces < conNum) {
                array[i] = conNum;
                veces++;
            }else{
                conNum++;
                array[i] = conNum;
                veces = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
