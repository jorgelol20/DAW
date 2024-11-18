package Programacion.UD5.P2.B;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caracter;
        int multiplicador;
        String textoF = "";
        System.out.print("Ingrese el númeor: ");
        int num = sc.nextInt();
        if(num < 0){
            caracter = '#';
            multiplicador = -1;
        }else{
            caracter = '*';
            multiplicador = 1;
        }
        for (int i = 1; i <= num*multiplicador; i++) {
            textoF += caracter;
        }
        System.out.println(textoF);
    }
}
