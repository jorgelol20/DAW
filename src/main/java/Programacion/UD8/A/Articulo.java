package Programacion.UD8.A;

public class Articulo {
    String nombreArticulo;
    double precio;
    final int iva = 21;
    int cuantosQuedan;
    double pvp;
    public void mostrarArticulo(){
        pvp = (precio + (precio * iva / 100));
        System.out.println("Nombre: " + nombreArticulo);
        if (precio < 0){
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        System.out.println("Precio: " + precio);
        System.out.println("Iva: " + iva + "%");
        if (cuantosQuedan < 0){
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
        System.out.println("Stock: " + cuantosQuedan);
        System.out.println("PVP: "+ pvp);
    }
}
