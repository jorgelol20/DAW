package Programacion.UD5.P2.A;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indica un número: ");
        int num = scanner.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.print(i + " ");
        }
    }
}
