package Programacion.UD6_1.A;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor N: ");
        int n = sc.nextInt();
        System.out.print("Introduce el valor M: ");
        int m = sc.nextInt();
        int[] array = new int[n];
        Arrays.fill(array, m);
        System.out.println(Arrays.toString(array));
    }
}
