package Programacion.UD6_1.A;

import java.util.Arrays;
import java.util.Scanner;

public class Ej17A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int cont = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el número "+cont+":");
            array1[i] = sc.nextInt();
            cont++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el número "+cont+":");
            array2[i] = sc.nextInt();
            cont++;
        }
        if(Arrays.equals(array1, array2)) {
            System.out.println("Los arrays son iguales");
        }else{
            System.out.println("Los arrays son diferentes");
        }
    }
}
