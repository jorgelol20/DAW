package Programacion.UD5.P2.B;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String piramide = "";
        System.out.print("Introduce la altura de la piramide: ");
        int altura = sc.nextInt();
        System.out.print("Introduce el carácter de relleno: ");
        String caracter = sc.next();
        for(int b = altura -1, c = 0; b >= 0; c++, b--){
            for(int i = 0; i < b; i++){
                System.out.print(" ");
            }
            if(b != altura - 1) {
                if (c % 2 == 0) {
                    for (int i = 0; i <= c; i++) {
                        System.out.print(caracter);
                    }
                } else {
                    c++;
                    for (int i = 0; i <= c; i++) {
                        System.out.print(caracter);
                    }
                }
            }else {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
