package Programacion.UD5.P2.B;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce N: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                System.out.print((i * j) +"\t");
            }
            System.out.println();
        }
    }
}
