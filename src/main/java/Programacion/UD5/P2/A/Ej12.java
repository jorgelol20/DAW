package Programacion.UD5.P2.A;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Indica el número que quieres elevar: ");
        int a = sc.nextInt();
        System.out.print("Introduce a cuanto quieres elevarlo:");
        int b = sc.nextInt();
        int resultado = a;
        if(b == 0) {
            for (int i = 1; i < b; i++) {
                resultado *= a;
            }
            System.out.println(resultado);
        }else{
            System.out.println("1");
        }

    }
}
