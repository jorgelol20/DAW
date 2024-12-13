package Programacion.UD6.A;

import java.util.Arrays;

public class Ej14A {
    public static void main(String[] args) {
        int[] array = new int[55];
        int conNum = 1;
        int contVeces = 0;
        for (int i = 0; i < array.length; i++) {
            if (contVeces < conNum) {
                array[i] = conNum;
                contVeces++;
            }else{
                conNum++;
                array[i] = conNum;
                contVeces = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
