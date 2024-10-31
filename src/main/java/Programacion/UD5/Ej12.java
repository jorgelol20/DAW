package Programacion.UD5;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cómo te llamas?");
        String nombre = scanner.next();
        char inicial = nombre.toUpperCase().charAt(0);
        System.out.print("¿Cuál es tu género (H o M)?");
        String genero = scanner.next();
        if(inicial<='M'&&genero.toUpperCase().equals("M")) {
            System.out.println("Tu grupo es A");
        }
        else if (inicial>='N'&&genero.toUpperCase().equals("H")) {
            System.out.println("Tu grupo es A");
        }else{
            System.out.println("Tu grupo es B");
        }
    }
}
