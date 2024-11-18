package Programacion.UD5.P1;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String clave = "thebest";
        System.out.print("Introduce la contraseña: ");
        String password = scanner.next();
        if (password.toLowerCase().equals(clave)){
            System.out.println("La contraseña coincide");
        }else{
            System.out.println("La contraseña no coincide");
        }
    }
}
