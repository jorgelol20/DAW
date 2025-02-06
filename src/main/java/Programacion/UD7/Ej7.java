package Programacion.UD7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> productos = new HashMap<String,Integer>();
        System.out.print("Introduce el número de productos: ");
        int numProductos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numProductos; i++) {
            System.out.print("Introduce el producto: ");
            String producto = sc.nextLine();
            System.out.print("Introduce la cantidad del producto: ");
            int cantidad = sc.nextInt();
            productos.put(producto,cantidad);
            sc.nextLine();
        }
        ArrayList<String> errores = validarInventario(productos);
        System.out.println("El inventario contiene los siguientes errores: ");
        for (String error : errores) {
            System.out.println("\t->"+error);
        }
    }
    public static ArrayList<String> validarInventario(HashMap<String,Integer> productos) {
        ArrayList<String> listaErrores = new ArrayList<>();
        for (String producto : productos.keySet()) {
            if (producto.equals("")){
                listaErrores.add("Nombre inválido para un producto con cantidad: "+productos.get(producto));
            }
            if (productos.get(producto) < 0 || productos.get(producto) > 100) {
                listaErrores.add("Cantidad inválida para el producto: '"+producto+"'");
            }
        }
        return listaErrores;
    }
}
