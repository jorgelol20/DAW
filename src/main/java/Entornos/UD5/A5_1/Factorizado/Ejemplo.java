package Entornos.UD5.A5_1.Factorizado;
import java.util.Scanner;
public class Ejemplo {
    public static double num1, num2;
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean continuar = true;
                // Mostrar menú de opciones
                System.out.println("---- Calculadora ----");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.print("Elige una opción: ");

                int opcion = scanner.nextInt();
                System.out.print("Introduce el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Introduce el segundo número: ");
                num2 = scanner.nextDouble();

                Opciones.opcion(opcion);
        }
    }

