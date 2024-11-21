package Programacion.UD4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class GPT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuando naciste?(DIA/MES/AÑO)\nEjemplo: 04/03/2007");
        String fechaNaciemiento = scanner.next();
        Date fechaHoy = new Date();
        SimpleDateFormat fechaFormato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaActual = fechaFormato.format(fechaHoy);
        System.out.println(fechaNaciemiento + "\n" + fechaActual);
/*
        if (){

        }else{

        }
 */
    }
}
