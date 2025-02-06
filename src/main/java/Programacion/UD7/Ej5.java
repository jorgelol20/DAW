package Programacion.UD7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Introduce una palabra (o salir para terminar de introducir palabras): ");
            String palabra = sc.nextLine();
            if (palabra.equalsIgnoreCase("salir")){
                break;
            }else{
                lista.add(palabra);
            }
        }

        HashMap<String, ArrayList<String>> mapa = filtrarPorVocal(lista);
        System.out.println("Palabras agrupadas por vocal inicial: ");
        for (String key : mapa.keySet()) {
            System.out.println(key + ": " + mapa.get(key));
        }
    }
    public static HashMap<String, ArrayList<String>> filtrarPorVocal(ArrayList<String> palabras) {
        HashMap<String, ArrayList<String>> mapa = new HashMap<String, ArrayList<String>>();
        for (String palabra : palabras) {;
            ArrayList<String> introducir = new ArrayList<String>();
            if (palabra == ""){
                continue;
            }
            if (palabra.charAt(0)=='a' || palabra.charAt(0)=='A') {
                if (!mapa.containsKey("a")) {
                    introducir.add(palabra);
                }else {
                    introducir.addAll(mapa.get("a"));
                    introducir.add(palabra);
                }
                mapa.put("a", introducir);
            }else if (palabra.charAt(0)=='e' || palabra.charAt(0)=='E') {
                if (!mapa.containsKey("e")) {
                    introducir.add(palabra);
                }else {
                    introducir.addAll(mapa.get("e"));
                    introducir.add(palabra);
                }
                mapa.put("e", introducir);
            }else if (palabra.charAt(0)=='i' || palabra.charAt(0)=='I') {
                if (!mapa.containsKey("i")) {
                    introducir.add(palabra);
                }else {
                    introducir.addAll(mapa.get("i"));
                    introducir.add(palabra);
                }
                mapa.put("i", introducir);
            }else if (palabra.charAt(0)=='o' || palabra.charAt(0)=='O') {
                if (!mapa.containsKey("o")) {
                    introducir.add(palabra);
                }else {
                    introducir.addAll(mapa.get("o"));
                    introducir.add(palabra);
                }
                mapa.put("o", introducir);
            }else if (palabra.charAt(0)=='u' || palabra.charAt(0)=='U') {
                if (!mapa.containsKey("u")) {
                    introducir.add(palabra);
                }else {
                    introducir.addAll(mapa.get("u"));
                    introducir.add(palabra);
                }
                mapa.put("u", introducir);
            }else{
                if (!mapa.containsKey("Otras")) {
                    introducir.add(palabra);
                }else {
                    introducir.addAll(mapa.get("Otras"));
                    introducir.add(palabra);
                }
                mapa.put("Otras", introducir);
            }
        }
        return mapa;
    }
}
