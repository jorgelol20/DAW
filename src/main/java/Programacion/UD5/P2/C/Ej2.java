package Programacion.UD5.P2.C;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num = sc.nextInt();
        while(true){
            if (num <= 2){
                System.out.print("El número debe ser mayor que 2: ");
                num = sc.nextInt();
            }else{
                break;
            }
        }
        int cont = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                cont++;
            }
        }
        if(cont != 2){
            System.out.println("El número no es primo");
        }else{
            System.out.println("El número es primo");
        }
    }
}
