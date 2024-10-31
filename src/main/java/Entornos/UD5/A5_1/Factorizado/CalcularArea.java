package Entornos.UD5.A5_1.Factorizado;

public class CalcularArea {
    public static double calcularArea(double radio) {
        // Fórmula del área de una esfera: 4 * PI * radio^2
        return 4 * Main.numPi * Math.pow(radio, 2);
    }
}
