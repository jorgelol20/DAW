package Programacion.UD8.Bombilla;

import java.util.ArrayList;
import java.util.List;

public class Bombilla {
    private static int contadorBombillas = 0;
    private boolean estadoBombilla;
    private boolean estadoAnteriorBombilla;
    private static boolean fusible;
    private static List<Bombilla> bombillas = new ArrayList<Bombilla>();

    public Bombilla(boolean estadoBombilla) {
        this.estadoBombilla = estadoBombilla;
        this.estadoAnteriorBombilla = estadoBombilla;
        bombillas.add(this);
        contadorBombillas++;
    }

    public void encenderBombilla() {
        this.estadoBombilla = true;
        this.estadoAnteriorBombilla = true;
    }

    public void apagarBombilla() {
        this.estadoAnteriorBombilla = false;
        this.estadoBombilla = false;
    }

    public static void encenderTodasBombillas() {
        for (Bombilla b : bombillas) {
            b.encenderBombilla();
        }
    }

    public static void apagarTodasBombillas() {
        for (Bombilla b : bombillas) {
            b.apagarBombilla();
        }
    }

    public static void indicarEstadoAnterior() {
        for (Bombilla b : bombillas) {
            b.estadoBombilla = b.estadoAnteriorBombilla;
        }
    }

    public static void bajarFusibles() {
        fusible = false;
        System.out.println("Suministro de electricidad cortado");
        for (Bombilla b : bombillas) {
            b.estadoBombilla = false;
        }
    }

    public static void arregarFusibles() {
        fusible = true;
        System.out.println("Suministro de electricidad reactivado");
        indicarEstadoAnterior();
    }

    public boolean getEstadoBombilla() {
        if (fusible) {
            return this.estadoBombilla;
        }else{
            return false;
        }
    }
    public boolean getEstadoAnteriorBombilla() {
        return this.estadoAnteriorBombilla;
    }

    public static int getContadorBombillas() {
        return contadorBombillas;
    }
}
