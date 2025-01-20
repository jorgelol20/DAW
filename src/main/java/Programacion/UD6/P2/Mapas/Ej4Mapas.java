package Programacion.UD6.P2.Mapas;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Ej4Mapas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> mapa = new HashMap<String, String>();
        mapa.put("Adrian","Adrian1234");
        mapa.put("Lina","Lina1234");
        mapa.put("Jorge","Jorge1234");

        String textoInicial = "Por favor, introduce nombre de usuario y contraseña para acceder al área restringida (3 intentos)";
        String textoUsuario = "Usuario: ";
        String textoPassword = "Contraseña: ";
        String textoOportunidades = "Quedan {0} oportunidades";
        String textoAcceso = "Ha accedido al área restringida";
        String textoDenegado = "Lo siento, no tiene acceso al área restringida";
        String usuario;
        String password;
        int oportunidades = 3;

        System.out.println(textoInicial);
        for (; 0 < oportunidades;) {
            System.out.print(textoUsuario);
            usuario = sc.nextLine();
            System.out.print(textoPassword);
            password = sc.nextLine();
            if (mapa.containsKey(usuario) && password.equals(mapa.get(usuario))) {
                System.out.println(textoAcceso);
                System.exit(0);
            } else {
                oportunidades--;
                System.out.println(MessageFormat.format(textoOportunidades, oportunidades));
            }
        }
        if (oportunidades == 0) {
            System.out.println(textoDenegado);
        }
    }
}
