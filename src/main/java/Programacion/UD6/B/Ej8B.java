package Programacion.UD6.B;

import java.util.Scanner;

public class Ej8B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su correo electrónico: ");
        String correo = sc.nextLine();
        sc.close();
        String[] correoFormateado = correo.split("@");
        String correoFinal = correoFormateado[0] + "@gmail.es";
        System.out.println(correoFinal);
    }
}
