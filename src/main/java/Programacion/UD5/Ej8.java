package Programacion.UD5;

import java.text.MessageFormat;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce N1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduce N2: ");
        double num2 = scanner.nextDouble();
        if(num1 == num2){
            System.out.println("Los números son iguales");
            System.exit(0);
        }else{
            if (num1%1==0 && num2%1==0) {
                System.out.println(MessageFormat.format("Números enteros: {0} y {1}",(int)num1,(int)num2));
            } else if (num1%1==0) {
                System.out.println(MessageFormat.format("Números enteros: {0}",(int)num1));
            } else if (num2%1==0) {
                System.out.println(MessageFormat.format("Números enteros: {0}",(int)num2));
            }else {
                System.out.println("Ningún número es entero");
            }
        }
    }
}
