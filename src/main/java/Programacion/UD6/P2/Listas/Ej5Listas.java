package Programacion.UD6.P2.Listas;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Ej5Listas {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> listaNombreContactos = new ArrayList<String>();
    private static ArrayList<String> listaTelefonoContactos = new ArrayList<String>();
    private static String textoNoEncontrado = "No se ha encontrado el contacto";
    private static String textoConfirmacion = "¿Seguro que desea eliminar el contacto? S/N";
    private static String textContinuar = "Presiona enter para continuar";

    public static void main(String[] args) {
        String sistemaOperativo = System.getProperties().getProperty("os.name");
        String textoOpciones = "Agenda de Contactos:\n" +
                "1. Añadir contacto\n" +
                "2. Ver contactos \n" +
                "3. Buscar contacto\n" +
                "4. Eliminar contacto\n" +
                "5. Salir\n" +
                "Elige una opción: ";
        String opcion;
        while (true) {
            System.out.print(textoOpciones);
            opcion = sc.nextLine();
            if (opcion.equals("1") || opcion.toLowerCase().contains("añadir")) {
                agregarContacto();
            } else if (opcion.equals("2") || opcion.toLowerCase().contains("ver")) {
                verContactos();
            } else if (opcion.equals("3") || opcion.toLowerCase().contains("buscar")) {
                buscarContactos();
            } else if (opcion.equals("4") || opcion.toLowerCase().contains("eliminar")) {
                eliminarContacto();
            } else if (opcion.equals("5") || opcion.toLowerCase().contains("salir")) {
                System.exit(0);
            } else {
                System.out.println("Introduzca una opcion válida");
                System.out.println(textContinuar);
                String enterSalida = sc.nextLine();
            }
            //"Limpiar" consola
            System.out.println("\n\n\n\n\n\n\n\n");
        }
    }

    public static void agregarContacto() {
        String textoAgregar1 = "Introduce el nombre: ";
        String textoAgregar2 = "Introduce el teléfono: ";
        String mensajeError = "Introduce un número de telefono válido";

        System.out.print(textoAgregar1);
        String nombre = sc.nextLine();
        String telefono;
        while (true) {
            System.out.print(textoAgregar2);
            telefono = sc.nextLine();
            boolean tieneLetra = false;
            for (int i = 0; i < telefono.length(); i++) {
                if (((telefono.charAt(i) > 65 && telefono.charAt(i) < 90)) || (telefono.charAt(i) > 97 && telefono.charAt(i) < 122)) {
                    tieneLetra = true;
                }
            }
                if (telefono.length() == 9 && (telefono.charAt(0) == '9' || telefono.charAt(0) == '6' || telefono.charAt(0) == '7') && !tieneLetra) {
                        listaTelefonoContactos.add(telefono);
                        listaNombreContactos.add(nombre);
                        break;
                } else {
                    System.out.println(mensajeError);
                }
        }
    }

    public static void verContactos() {
        Iterator<String> iteradorNombres = listaNombreContactos.iterator();
        Iterator<String> iteradorTelefonos = listaTelefonoContactos.iterator();
        if (!listaNombreContactos.isEmpty()) {
            while (iteradorNombres.hasNext()) {
                System.out.println(MessageFormat.format("Nombre: {0}, Teléfono: {1}", iteradorNombres.next(), iteradorTelefonos.next()));
            }
        } else {
            System.out.println("No hay contactos guardados");
        }
        System.out.println(textContinuar);
        String enterSalida = sc.nextLine();
    }

    public static void buscarContactos() {
        Iterator<String> iteradorNombres = listaNombreContactos.iterator();
        Iterator<String> iteradorTelefonos = listaTelefonoContactos.iterator();
        System.out.print("Introduce el contacto a buscar: ");
        String contacto = sc.nextLine();
        String nombreContacto ;
        String telefonoContacto;
        int index = 0;
        boolean contactoEncontrado = false;
        for (;iteradorNombres.hasNext();) {
            nombreContacto = iteradorNombres.next();
            telefonoContacto = iteradorTelefonos.next();
            if (contacto.equalsIgnoreCase(nombreContacto)) {
                index = listaNombreContactos.indexOf(nombreContacto);
                contactoEncontrado = true;
                break;
            }else if (Objects.equals(telefonoContacto, contacto)){
                index = listaTelefonoContactos.indexOf(telefonoContacto);
                contactoEncontrado = true;
                break;
            }
        }
        if (contactoEncontrado) {
            nombreContacto = listaNombreContactos.get(index);
            telefonoContacto = listaTelefonoContactos.get(index);
            System.out.println(MessageFormat.format("Nombre: {0}, Teléfono: {1}", nombreContacto, telefonoContacto));
        }else{
            System.out.println(textoNoEncontrado);
        }
        System.out.println(textContinuar);
        String enterSalida = sc.nextLine();
    }
    private static void eliminarContacto() {
        System.out.println("Introduce el contacto a eliminar: ");
        String contacto = sc.nextLine();
        Iterator<String> iteradorNombres = listaNombreContactos.iterator();
        Iterator<String> iteradorTelefonos = listaTelefonoContactos.iterator();
        String nombreContacto ;
        String telefonoContacto;
        int index = 0;
        boolean contactoEncontrado = false;
        for (;iteradorNombres.hasNext();) {
            nombreContacto = iteradorNombres.next();
            telefonoContacto = iteradorTelefonos.next();
            if (contacto.equalsIgnoreCase(nombreContacto)) {
                index = listaNombreContactos.indexOf(nombreContacto);
                contactoEncontrado = true;
                break;
            }else if (Objects.equals(telefonoContacto, contacto)){
                index = listaTelefonoContactos.indexOf(telefonoContacto);
                contactoEncontrado = true;
                break;
            }
        }
        if (contactoEncontrado) {
            nombreContacto = listaNombreContactos.get(index);
            telefonoContacto = listaTelefonoContactos.get(index);
            System.out.println(MessageFormat.format("Nombre: {0}, Teléfono: {1}", nombreContacto, telefonoContacto));
            System.out.print(textoConfirmacion);
            String confirmacion = sc.nextLine();
            if (confirmacion.toUpperCase().contains("S")) {
                listaNombreContactos.remove(index);
                listaTelefonoContactos.remove(index);
                System.out.println("Contacto eliminado con éxito");
            }else{
                System.out.println("El contacto no se ha eliminado");
            }

        }else{
            System.out.println(textoNoEncontrado);
        }
        System.out.println(textContinuar);
        String enterSalida = sc.nextLine();
    }
}
