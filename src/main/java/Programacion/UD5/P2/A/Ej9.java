package Programacion.UD5.P2.A;

public class Ej9 {
    public static void main(String[] args) {
        int acumSuma = 0;
        int acumMult = 1;
        for(int i = 1; i <= 10; i++){
            acumSuma += i;
            acumMult *= i;
        }
        System.out.println("Suma: "+acumSuma);
        System.out.println("Multiplicación: "+acumMult);
    }
}
