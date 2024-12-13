package Programacion.UD5.P2.C;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce N1: ");
        int n1 = sc.nextInt();
        System.out.println("Introduce N2: ");
        int n2 = sc.nextInt();
        if (n1 < n2) {
            System.out.println("Orden creciente");
            for(int i = n1; i <= n2; i++) {
                System.out.print(i + " ");
            }
            System.out.println("\nOrden decreciente");
            for(int i = n2; i >= n1; i--) {
                System.out.print(i + " ");
            }
        }else{
            System.out.println("N2 debe ser mayor que N1");
        }
    }
}
