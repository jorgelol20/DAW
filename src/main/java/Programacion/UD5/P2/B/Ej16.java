package Programacion.UD5.P2.B;

import java.text.MessageFormat;
import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce primer día: ");
        String diaSem = sc.nextLine();
        String primerDia = "";
        int numDia1 = 0;
        //Saber el día 1
        boolean salir = false;
        while (!salir) {
            if (diaSem.equals("1") || diaSem.equalsIgnoreCase("Lunes")) {
                primerDia = "Lunes";
                numDia1 = 1;
                salir = true;
            } else if (diaSem.equals("2") || diaSem.equalsIgnoreCase("Martes")) {
                primerDia = "Martes";
                numDia1 = 2;
                salir = true;
            } else if (diaSem.equals("3") || diaSem.equalsIgnoreCase("Miercoles")) {
                primerDia = "Miercoles";
                numDia1 = 3;
                salir = true;
            } else if (diaSem.equals("4") || diaSem.equalsIgnoreCase("Jueves")) {
                primerDia = "Jueves";
                numDia1 = 4;
                salir = true;
            } else if (diaSem.equals("5") || diaSem.equalsIgnoreCase("Viernes")) {
                primerDia = "Viernes";
                numDia1 = 5;
                salir = true;
            } else if (diaSem.equals("6") || diaSem.equalsIgnoreCase("Sabado")) {
                primerDia = "Sabado";
                numDia1 = 6;
                salir = true;
            } else if (diaSem.equals("7") || diaSem.equalsIgnoreCase("Domingo")) {
                primerDia = "Domingo";
                numDia1 = 7;
                salir = true;
            } else {
                System.out.println("Introduce un día valido: ");
                diaSem = sc.next();
            }
        }

        //Hora día 1
        System.out.println("Introduce la hora del " + primerDia + ": ");
        int horaDia1 = sc.nextInt();
        while (true) {
            if (horaDia1 < 0 || horaDia1 > 23) {
                System.out.println("Introduce un hora valida para el " + primerDia + ": ");
                horaDia1 = sc.nextInt();
            } else {
                break;
            }
        }
        //Saber y validar el día 2
        String segundoDia = "";
        int numDia2 = 0;
        while (true) {
            System.out.println("Introduce el segundo día: ");
            diaSem = sc.next();
            if (diaSem.equals("1") || diaSem.equalsIgnoreCase("Lunes")) {
                segundoDia = "Lunes";
                numDia2 = 1;
                if (numDia2 < numDia1) {
                    System.out.println(MessageFormat.format("Error, el {0} es anterior al {1}", segundoDia, primerDia));
                } else {
                    break;
                }
            } else if (diaSem.equals("2") || diaSem.equalsIgnoreCase("Martes")) {
                segundoDia = "Martes";
                numDia2 = 2;
                if (numDia2 < numDia1) {
                    System.out.println(MessageFormat.format("Error, el {0} es anterior al {1}", segundoDia, primerDia));
                } else {
                    break;
                }
            } else if (diaSem.equals("3") || diaSem.equalsIgnoreCase("Miercoles")) {
                segundoDia = "Miercoles";
                numDia2 = 3;
                if (numDia2 < numDia1) {
                    System.out.println(MessageFormat.format("Error, el {0} es anterior al {1}", segundoDia, primerDia));
                } else {
                    break;
                }
            } else if (diaSem.equals("4") || diaSem.equalsIgnoreCase("Jueves")) {
                segundoDia = "Jueves";
                numDia2 = 4;
                if (numDia2 < numDia1) {
                    System.out.println(MessageFormat.format("Error, el {0} es anterior al {1}", segundoDia, primerDia));
                } else {
                    break;
                }
            } else if (diaSem.equals("5") || diaSem.equalsIgnoreCase("Viernes")) {
                segundoDia = "Viernes";
                numDia2 = 5;
                if (numDia2 < numDia1) {
                    System.out.println(MessageFormat.format("Error, el {0} es anterior al {1}", segundoDia, primerDia));
                } else {
                    break;
                }
            } else if (diaSem.equals("6") || diaSem.equalsIgnoreCase("Sabado")) {
                segundoDia = "Sabado";
                numDia2 = 6;
                if (numDia2 < numDia1) {
                    System.out.println(MessageFormat.format("Error, el {0} es anterior al {1}", segundoDia, primerDia));
                } else {
                    break;
                }
            } else if (diaSem.equals("7") || diaSem.equalsIgnoreCase("Domingo")) {
                segundoDia = "Domingo";
                break;
            } else {
                System.out.println("Introduce un día valido");
            }
        }
        //Hora día 2
        System.out.println("Introduce la hora del " + segundoDia + ": ");
        int horaDia2 = sc.nextInt();
        while (true) {
            if (horaDia2 < 0 || horaDia2 > 23) {
                System.out.println("Introduce un hora valida para el " + primerDia + ": ");
                horaDia2 = sc.nextInt();
            } else {
                break;
            }
        }
        //Sacar las horas

    }
}