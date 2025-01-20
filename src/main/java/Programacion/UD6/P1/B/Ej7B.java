package Programacion.UD6_1.B;

import java.util.Scanner;

public class Ej7B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        String precio = sc.nextLine();
        String[] euros = new String[2];
        euros = precio.split(",");
        System.out.println("Euros: "+ euros[0]);
        System.out.println("Céntimos: "+ euros[1]);
    }
}
