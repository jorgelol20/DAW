package Entornos.UD5.A5_1.Factorizado;

public class CalcularVolumen {
    public static double calcularVolumen(double radio) {
        // Fórmula del volumen de una esfera: (4/3) * PI * radio^3
        return (4.0 / 3.0) * Main.numPi * Math.pow(radio, 3);
    }
}
