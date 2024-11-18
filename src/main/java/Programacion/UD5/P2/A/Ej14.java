package Programacion.UD5.P2.A;

import java.text.MessageFormat;
import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dinero;
        int billete500 = 0;
        int billete200 = 0;
        int billete100 = 0;
        int billete50 = 0;
        int billete20 = 0;
        int billete10 = 0;
        int billete5 = 0;

        while (true) {
            System.out.print("Introduzca el dinero (Múltiplo de 5): ");
            dinero = sc.nextInt();
            if (dinero % 5 == 0) {
                break;
            } else {
                System.out.println("No es múltiplo de 5");
            }
        }
        while (dinero != 0) {
            if (dinero >= 500) {
                billete500++;
                dinero -= 500;
            }else if(dinero >= 200){
                billete200++;
                dinero -= 200;
            }else if(dinero >= 100){
                billete100++;
                dinero -= 100;
            }else if(dinero >= 50){
                billete50++;
                dinero -= 50;
            }else if(dinero >= 20){
                billete20++;
                dinero -= 20;
            }else if(dinero >= 10){
                billete10++;
                dinero -= 10;
            }else{
                billete5++;
                dinero -= 5;
            }
        }
        System.out.println(MessageFormat.format("Con {0} euros, necesitaremos {1} billetes de 500, {2} billetes de 200, " +
                                                        "\n {3} billetes de 100, {4} billetes de 50, " +
                                                        "\n {5} billetes de 20, {6} billetes de 10" +
                                                        "\n y {7} billetes de 5",dinero,billete500,billete200,billete100,billete50,billete20,billete10,billete5));
    }
}
