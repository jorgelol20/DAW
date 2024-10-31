package Entornos.UD5.A5_1.Original;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el radio de la esfera: ");
        double radio = scanner.nextDouble();

        double area = calcularArea(radio);
        double volumen = calcularVolumen(radio);

        System.out.println("El área de la esfera es: " + area);
        System.out.println("El volumen de la esfera es: " + volumen);

        scanner.close();
    }

    public static double calcularArea(double radio) {
        // Fórmula del área de una esfera: 4 * PI * radio^2
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    public static double calcularVolumen(double radio) {
        // Fórmula del volumen de una esfera: (4/3) * PI * radio^3
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
}

