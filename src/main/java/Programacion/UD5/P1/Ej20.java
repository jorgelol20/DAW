package Programacion.UD5.P1;
import javax.swing.*;
import java.text.MessageFormat;

public class Ej20 {
    public static void main(String[] args) {
        //Creación de la plantilla del texto de salida y declaración de variables
        String texto = "Por las {0} horas trabajadas, a {1} le corresponde un salario bruto \n de {2} y un neto de {3} tras aplicar {4} euros de impuestos.";
        int horas;
        double tarifa;
        double bruto;
        //Introducir el nombre del usuario por interfaz gráfica.
        String nombre = JOptionPane.showInputDialog(null, "¿Cómo te llamas?","Act20",JOptionPane.QUESTION_MESSAGE);
        //LOs bucle se ejecutarán hasta que indiquen un valor válido, en este caso un "int"
        while(true) {
            try {
                horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce las horas trabajadas","Act20",JOptionPane.QUESTION_MESSAGE));
                break;
            } catch (ArithmeticException | IllegalArgumentException e) {
                JOptionPane.showConfirmDialog(null,"Introduce un número de horas válido", "Act20",JOptionPane.DEFAULT_OPTION);
            }
        }
        while(true) {
            try {
                tarifa = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la tarida por hora","Act20",JOptionPane.QUESTION_MESSAGE));
                break;
            } catch (ArithmeticException | IllegalArgumentException e) {
                JOptionPane.showConfirmDialog(null,"Introduce una tarifa válida", "Act20",JOptionPane.DEFAULT_OPTION);
            }
        }
        //Comprubea si las horas son 35 o menos para aplicar la tarifa correspondiente
        if(horas <= 35){
            bruto = tarifa * horas;
        }else{
            bruto = ((tarifa * 35) + ((tarifa * 1.5) * (horas - 35)));
        }
        //Si el bruto es menor o igual a 500 no se le aplicarán impuestos y directamente dirá el texto formateado.
        if(bruto <= 500){
            JOptionPane.showConfirmDialog(null, MessageFormat.format(texto,horas,nombre,bruto, bruto,0.0), "Act20",JOptionPane.DEFAULT_OPTION);
            System.exit(0);

        }
        //Comprueba si el bruto es menor o igual a 500 que, a los últimos 400 euros (pueden ser menos) se les aplique el 25% de impuesto
        else if (bruto <= 900) {
            double neto = 500 + ((bruto - 500) - ((bruto - 500) * 0.25));
            double tasa = bruto - neto;
            JOptionPane.showConfirmDialog(null, MessageFormat.format(texto,horas,nombre,bruto,neto,tasa), "Act20",JOptionPane.DEFAULT_OPTION);
            System.exit(0);
        }
        //Si el bruto es mayor a 900, el neto será 800 (500 + (400 - 25% de 400 = 300)) más el resto del dinero aplicandole el 45% de impuestos
        else{
            double bruto1 = bruto - 900;
            double neto = 800 + ((bruto1) - (bruto1 * 0.45));
            double tasa = bruto - neto;
            JOptionPane.showConfirmDialog(null, MessageFormat.format(texto,horas,nombre,bruto,neto,tasa), "Act20",JOptionPane.DEFAULT_OPTION);
            System.exit(0);
        }
    }
}