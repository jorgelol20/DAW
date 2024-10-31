package Entornos.UD5.A5_1.Factorizado;

import java.util.Scanner;

public class Main {
    private static double volumen = 0.0;
    private static double area = 0.0;
    public final static double numPi = Math.PI;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el radio de la esfera: ");
        double radio = scanner.nextDouble();

        area = CalcularArea.calcularArea(radio);
        volumen = CalcularVolumen.calcularVolumen(radio);

        System.out.println("El área de la esfera es: " + area);
        System.out.println("El volumen de la esfera es: " + volumen);

        scanner.close();
    }
}
