package Programacion.UD5.P2.A;

import java.text.MessageFormat;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String texto1 = "Han habido {0} positivos y {1} negativos";
        String texto2 = "Son todos positivos";
        String texto3 = "Son todos negativos";
        String texto4 = "Han habido {0} positivo y un negativo";
        String texto5 = "Ha habido un positivo y {0} negativos";
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        for(int i = 1;i <= 10; i++){
            System.out.print(MessageFormat.format("Número {0}: ", i));
            num = sc.nextInt();
            if(num > 0){
                contadorPositivos++;
            }else {
                contadorNegativos++;
            }
        }
        if (contadorNegativos > 0 && contadorPositivos > 0 && contadorNegativos != 10 && contadorPositivos != 10 && contadorNegativos != 1 && contadorPositivos != 1) {
            System.out.println(MessageFormat.format(texto1, contadorNegativos, contadorPositivos));
        } else if (contadorNegativos == 0) {
            System.out.println(texto2);
        }else if (contadorPositivos == 0) {
            System.out.println(texto3);
        }else if (contadorNegativos == 1) {
            System.out.println(MessageFormat.format(texto4, contadorPositivos));
        }else if (contadorPositivos == 1) {
            System.out.println(MessageFormat.format(texto5, contadorNegativos));
        }
    }
}
