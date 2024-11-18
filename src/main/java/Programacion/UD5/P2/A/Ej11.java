package Programacion.UD5.P2.A;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acumPar = 0;
        int acumImpar = 0;
        for(int i = 100;i <= 200;i++){
            if (i % 2 == 0){
                acumPar += i;
            }else {
                acumImpar += i;
            }
        }
        System.out.println(acumPar);
        System.out.println(acumImpar);
    }
}
