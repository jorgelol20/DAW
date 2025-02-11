package Programacion.UD10;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class Ej5 {
    private static final String[] arrayNums1 = {"23","34","65","23","76","12","76","2","0","25","1","7","33"};
    public static void main(String[] args) {
        int posicion1 = 0;
        int posicion2 = 0;
        try{
            posicion1 = posicion();
            posicion1 = Integer.parseInt(arrayNums1[posicion1]);
            posicion2 = posicion();
            posicion2 = Integer.parseInt(arrayNums1[posicion2]);
            JOptionPane.showMessageDialog(null,"La división es "+division(posicion1,posicion2));
        }catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, "No es posible la division del numero "+posicion1+" entre "+posicion2);
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Posición seleccionada no existente en el array");
        }

    }
    public static String division(int num1, int num2) {
        DecimalFormat df = new DecimalFormat("#.##");
        if (num2 == 0){
            throw new ArithmeticException();
        }
        try{
            double resultado =  (double) num1 /num2;
            return df.format(resultado);
        }catch(ArithmeticException e){
            throw new ArithmeticException();
        }catch(NumberFormatException e){
            throw new NumberFormatException();
        }
    }
    public static int posicion() {
        try {
            return Integer.parseInt(String.valueOf(JOptionPane.showOptionDialog(null, "Selecciona una posición","Seleccionar posición", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null, arrayNums1,null)));
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número no valido, se seleccionará el valor por defecto");
            return  0;
        }
    }
}
