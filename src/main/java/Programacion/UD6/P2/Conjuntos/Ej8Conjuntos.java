package Programacion.UD6.P2.Conjuntos;

import java.text.MessageFormat;
import java.util.Scanner;
import java.util.TreeSet;

public class Ej8Conjuntos {
    public static void main(String[] args) {
        String rojo = "\033[31m";
        String reset = "\033[0m";
        Scanner sc = new Scanner(System.in);
        String conjunto1;
        String conjunto2;
        int[] conjunto1Array;
        int[] conjunto2Array;
        TreeSet<Integer> conjunto1TreeSet = new TreeSet<>();
        TreeSet<Integer> conjunto2TreeSet = new TreeSet<>();
        TreeSet<Integer> repetidosTreeSet = new TreeSet<>();
        TreeSet<Integer> unionTreeSet = new TreeSet<>();

        //Comprobación conjunto1
        while (true){
            boolean salir = true;
            System.out.println(reset+"Introduce el primer conjunto de números separados por comas: ");
            conjunto1 = sc.nextLine();
            String[] convertidorArray = conjunto1.split(",");
            conjunto1Array = new int[convertidorArray.length];
            for (int i = 0; i < convertidorArray.length; i++) {
                try {
                    conjunto1Array[i] = Integer.parseInt(convertidorArray[i]);
                }catch (Exception e){
                    System.out.println(rojo+"El conjunto introducido no es valido");
                    salir = false;
                    break;
                }
            }
            if (salir){
                break;
            }
        }
        //Comprobación conjunto2
        while (true){
            boolean salir = true;
            System.out.println(reset+"Introduce el segundo conjunto de números separados por comas: ");
            conjunto2 = sc.nextLine();
            String[] convertidorArray = conjunto2.split(",");
            conjunto2Array = new int[convertidorArray.length];
            for (int i = 0; i < convertidorArray.length; i++) {
                try {
                    conjunto2Array[i] = Integer.parseInt(convertidorArray[i]);
                }catch (Exception e){
                    System.out.println(rojo+"El conjunto introducido no es valido");
                    salir = false;
                    break;
                }
            }
            if (salir){
                break;
            }
        }

        for (int j : conjunto1Array) {
            conjunto1TreeSet.add(j);
        }
        for (int j : conjunto2Array) {
            conjunto2TreeSet.add(j);
        }
        for (int j : conjunto1TreeSet) {
            for (int k : conjunto2TreeSet) {
                if (j == k) {
                    repetidosTreeSet.add(j);
                }
            }
        }

        unionTreeSet.addAll(conjunto1TreeSet);
        unionTreeSet.addAll(conjunto2TreeSet);
        System.out.println(MessageFormat.format("Intersección: {0}\n" +
                                                "Unión: {1}", repetidosTreeSet, unionTreeSet));
    }
}
