package Programacion.UD7;

import java.util.Arrays;
import java.util.List;

public class PruebaArray {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs");
        System.out.println(containAllBots("bsjq",lista));
    }

    public static boolean containAllBots(String strng, List<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if(!arr.get(i).contains(strng)) {
                return false;
            }
        }
        return true;
    }

}
