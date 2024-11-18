package Programacion.UD5.P2.B;

import java.util.Scanner;
import java.util.Timer;

public class Ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una hora en formato (HH:MM:SS): ");
        String horaFormat = sc.next();
        String hora = horaFormat.charAt(0) + "" + horaFormat.charAt(1);
        String minuto = horaFormat.charAt(3) + "" + horaFormat.charAt(4);
        String segundos = horaFormat.charAt(6) + "" + horaFormat.charAt(7);
        while (true) {
            if (horaFormat.length() == 8) {
                if (Integer.parseInt(hora) <= 23 && Integer.parseInt(hora) >= 0) {
                    if (Integer.parseInt(minuto) <= 59 && Integer.parseInt(minuto) >= 0) {
                        if (Integer.parseInt(segundos) <= 59 && Integer.parseInt(segundos) >= 0) {
                            break;
                        }
                    }
                }
            }
            System.out.print("Formato incorrecto, vuelva a introducirla: ");
            horaFormat = sc.next();
            hora = horaFormat.charAt(0) + "" + horaFormat.charAt(1);
            minuto = horaFormat.charAt(3) + "" + horaFormat.charAt(4);
            segundos = horaFormat.charAt(6) + "" + horaFormat.charAt(7);
        }
        while (true) {
            if (Integer.parseInt(segundos) == 59 ) {
                segundos = "00";
                if (Integer.parseInt(minuto) == 59) {
                    minuto = "00";
                    if (Integer.parseInt(hora) == 23) {
                        hora = "00";
                    }else{
                        hora = String.valueOf(Integer.parseInt(hora)+1);
                    }
                }else{
                    minuto = String.valueOf(Integer.parseInt(minuto)+1);
                }
            }else{
                segundos = String.valueOf(Integer.parseInt(segundos)+1);
            }
            System.out.println(hora +":"+ minuto +":"+ segundos);
        }
    }
}
