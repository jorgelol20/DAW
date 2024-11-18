package Programacion.UD5.P1;

import java.text.MessageFormat;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce N1: ");
        double n = sc.nextDouble();
        //Los double pueden ser atributos, osea, "private static" arriba
        System.out.print("Introduce N2: ");
        double n2 = sc.nextDouble();

        //Los IF puedes llevarlos a otra función/clase
        if(n == n2){
            System.out.println("Los números son iguales");
            System.exit(0);
        }else{
            if (n%1==0 && n2%1==0) {
                System.out.println(MessageFormat.format("Números enteros: {0} y {1}",(int)n,(int)n2));
            } else if (n%1==0) {
                System.out.println(MessageFormat.format("Números enteros: {0}",(int)n));
            } else if (n2%1==0) {
                System.out.println(MessageFormat.format("Números enteros: {0}",(int)n2));
            }else {
                System.out.println("Ningún número es entero");
            }
        }
    }
}
