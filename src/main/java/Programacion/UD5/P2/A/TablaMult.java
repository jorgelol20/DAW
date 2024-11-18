package Programacion.UD5.P2.A;

import java.text.MessageFormat;

public class TablaMult {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.println(MessageFormat.format("{0}*{1}={2}", i, j, (i*j)));
            }
        }
    }
}
