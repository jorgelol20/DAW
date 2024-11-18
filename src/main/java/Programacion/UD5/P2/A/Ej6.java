package Programacion.UD5.P2.A;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean negativo = false;
        for (int i = 1; i <= 100; i++) {
            System.out.print("Número "+i+" : ");
            int num = scanner.nextInt();
            if(num < 0){
                negativo = true;
            }
        }
        if(negativo){
            System.out.println("Ha habido un número negativo");
        }else{
            System.out.println("No ha habido un número negativo");
        }
    }
}
