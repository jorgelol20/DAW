package Programacion.UD6.P2.Listas;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Ej2Listas {
    public static void main(String[] args) {
        int tamanyoMaximoLista = 20;
        int tamanyoMinimoLista = 10;
        int valorMaximoNumeros = 100;
        int valorMinimoNumeros = 0;
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int tamanyoLista = (int) (Math.random() * (tamanyoMaximoLista - tamanyoMinimoLista) + tamanyoMinimoLista);
        int acumuladorValores = 0;

        for (int i = 0; i < tamanyoLista ; i++) {
            int valorAleatorio = (int)(Math.random() * (valorMaximoNumeros - valorMinimoNumeros) + valorMinimoNumeros);
            lista.add(valorAleatorio);
            acumuladorValores += valorAleatorio;
        }
        int mediaLista = acumuladorValores / tamanyoLista;
        ArrayList<Integer> listaOrdenada = new ArrayList<>(lista);
        Collections.sort(listaOrdenada);
        int valorMaximoLista = listaOrdenada.getLast();
        int valorMinimoLista = listaOrdenada.getFirst();
        System.out.println(MessageFormat.format("Lista: {0}\nSuma de la lista: {1}\nValor Máximo: {2}\nValor Mínimo: {3}\nMedia: {4}", lista,acumuladorValores,valorMaximoLista, valorMinimoLista, mediaLista));
    }
}
