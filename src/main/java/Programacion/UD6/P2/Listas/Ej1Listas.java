package Programacion.UD6.P2.Listas;

import java.util.ArrayList;
import java.util.Iterator;

public class Ej1Listas {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Adrian");
        lista.add("Lina");
        lista.add("Helena");
        lista.add("Dorothy");
        lista.add("Fran");
        lista.add("Toni");
        Iterator<String> iterator = lista.iterator();
        for (;iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
