package Entornos.UD5.A5_1.Factorizado;

import java.util.Scanner;

public class Main {
    //Declaración de variables públicas
    private static double volumen = 0.0;
    private static double area = 0.0;
    //Declaración de constante pública
    public final static double numPi = Math.PI;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //El usuario introduce el valor del radio
        System.out.print("Introduce el radio de la esfera: ");
        double radio = scanner.nextDouble();
        //Area será igual al resultado de la funcion calcularArea en la clase CalcularArea pasando como valor el radio
        area = CalcularArea.calcularArea(radio);
        //Volumen será igual al resultado de la funcion calcularVolumen en la clase CalcularVolumen pasando como valor el radio
        volumen = CalcularVolumen.calcularVolumen(radio);
        //Sacamos por pantalla ambos resultados
        System.out.println("El área de la esfera es: " + area + "\nEl volumen de la esfera es: " + volumen);
        scanner.close();
    }
}
