package Programacion.UD7;

import java.text.MessageFormat;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las palabras separadas por espacios: ");
        String[] palabras = sc.nextLine().split(" ");
        System.out.print("Introduce la longitud de referencia: ");
        int longitud = sc.nextInt();
        int[] contadores = contarPorLongitud(palabras, longitud);
        System.out.println(MessageFormat.format("Palabras de longitud igual: {0}\n" +
                                                "Palabras de longitud menor: {1}\n" +
                                                "Palabras de longitud mayor: {2}",
                                                contadores[0], contadores[1], contadores[2]));
    }
    public static int[] contarPorLongitud(String[] palabras, int longitud) {
        int[] contadores = {0,0,0};
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > longitud) {
                contadores[2]++;
            }else if(palabras[i].length() < longitud){
                contadores[1]++;
            }else{
                contadores[0]++;
            }
        }
        return contadores;
    }
}
