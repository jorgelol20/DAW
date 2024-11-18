package Programacion.UD5.P2.A;

import java.text.MessageFormat;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contPos = 0;
        int contNeg = 0;

        while(true){
            System.out.print("Introduce número: ");
            int numero = sc.nextInt();
            if (numero == 0){
                break;
            }else if(numero < 0){
                contNeg++;
            }else{
                contPos++;
            }
        }

        if(contNeg > 0){
            System.out.println("Han habido negativos");
        }
        System.out.println(MessageFormat.format("Han habido {0} positivos y {1} negativos",contPos,contNeg));
    }
}
