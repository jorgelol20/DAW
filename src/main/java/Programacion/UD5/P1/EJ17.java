package Programacion.UD5.P1;

import java.util.Scanner;

public class EJ17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la hora (HH:MM:SS): ");
        String horaCompleta = scanner.next();
        String hora;
        hora = horaCompleta.charAt(0) + "" + horaCompleta.charAt(1);
        String minutos;
        minutos = horaCompleta.charAt(3) + "" + horaCompleta.charAt(4);
        String segundos;
        segundos = horaCompleta.charAt(6) + "" + horaCompleta.charAt(7);
        if (segundos.equals("59")) {
            segundos = "00";
            if (minutos.equals("59")) {
                minutos = "00";
                if (hora.equals("23")) {
                    hora = "00";
                }else{
                    hora = String.valueOf(Integer.parseInt(hora)+1);
                }
            } else {
                minutos = String.valueOf(Integer.parseInt(minutos)+1);
            }
        } else {
            segundos = String.valueOf(Integer.parseInt(segundos)+1);
        }
        System.out.println(hora+":"+minutos+":"+segundos);
    }
}
