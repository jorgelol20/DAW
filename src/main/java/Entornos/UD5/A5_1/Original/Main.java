package Entornos.UD5.A5_1.Original;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el radio de la esfera: ");
        double radio = scanner.nextDouble();
        double area = 4 * Math.PI * Math.pow(radio, 2);;
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        System.out.println("El área de la esfera es: " + area);
        System.out.println("El volumen de la esfera es: " + volumen);
        scanner.close();
    }
}

