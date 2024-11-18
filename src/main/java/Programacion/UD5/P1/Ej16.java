package Programacion.UD5.P1;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = scanner.nextDouble();
        if(nota<3){
            System.out.println("Muy Deficiente");
        }else if(nota<5){
            System.out.println("Insuficiente");
        }else if(nota<6){
            System.out.println("Bien");
        }else if(nota<9){
            System.out.println("Notable");
        }else if(nota<=10){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("No valida");
        }
    }
}
