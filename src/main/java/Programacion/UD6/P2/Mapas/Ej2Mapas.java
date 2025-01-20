package Programacion.UD6.P2.Mapas;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
// la palabra que más aparece en este texto es la palabra palabra
public class Ej2Mapas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        String[] palabrasFrase = frase.split(" ");
        LinkedHashMap<String, String> mapa = new LinkedHashMap<>();
        for (int j = 0; j < palabrasFrase.length; j++) {
            if (mapa.containsKey(palabrasFrase[j])) {
                mapa.put(palabrasFrase[j], mapa.get(palabrasFrase[j]) + " " + j);
            } else {
                mapa.put(palabrasFrase[j], String.valueOf(j));
            }
        }
        for (String key : mapa.keySet()) {
            String stringValues = mapa.get(key);
            String[] splitValues = stringValues.split(" ");
            System.out.println(key + "=" + Arrays.toString(splitValues));
        }
    }
}
