package Programacion.UD5.P2.A;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número para realizar su factorial: ");
        int num = scanner.nextInt();
        for (int i = num - 1; i > 0; i--) {
            num = num * i;
        }
        System.out.println(num);
    }
}
