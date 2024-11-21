package Entornos.UD5.A5_1.Factorizado;

public class Opciones {
    public static void opcion(int opcion){
        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (Ejemplo.num1 + Ejemplo.num2));
                break;
            case 2:
                System.out.println("Resultado: " + (Ejemplo.num1 - Ejemplo.num2));
                break;
            case 3:
                System.out.println("Resultado: " + (Ejemplo.num1 * Ejemplo.num2));
                break;
            case 4:
                if (Ejemplo.num2 != 0) {
                    System.out.println("Resultado: " + (Ejemplo.num1 / Ejemplo.num2));
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
        }
    }
}
