package Programacion.UD5.P2.A;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 1;
        boolean diez = false;
        String colorRojo = "\u001B[31m";
        String colorBlanco = "\u001B[37m";
        while (true) {
            System.out.print(colorBlanco + "Introduzca la nota "+cont+": ");
            int nota = entrada.nextInt();
            cont++;
            if (nota == -1){
                break;
            } else if (nota > 10 || nota < 0) {
                System.out.println(colorRojo + "Introduzca notas validas");
            } else if (nota == 10) {
                diez = true;
            }
        }
        if (diez) {
            System.out.println(colorBlanco + "Ha habido un 10");
        }else {
            System.out.println(colorBlanco + "No ha habido un 10");
        }
    }
}
