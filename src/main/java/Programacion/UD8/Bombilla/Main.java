package Programacion.UD8.Bombilla;

public class Main {
    public static void main(String[] args) {
        Bombilla bombilla1 = new Bombilla(true);
        Bombilla bombilla2 = new Bombilla(false);
        Bombilla bombilla3 = new Bombilla(true);
        System.out.println("Bombilla 1: "+bombilla1.getEstadoBombilla()+"/"+bombilla1.getEstadoAnteriorBombilla());
        System.out.println("Bombilla 2: "+bombilla2.getEstadoBombilla()+"/"+bombilla2.getEstadoAnteriorBombilla());
        System.out.println("Bombilla 3: "+bombilla3.getEstadoBombilla()+"/"+bombilla3.getEstadoAnteriorBombilla());
        System.out.println("NumBombillas: "+Bombilla.getContadorBombillas()+"\n");

        bombilla1.apagarBombilla();
        System.out.println("Bombilla 1: "+bombilla1.getEstadoBombilla()+"/"+bombilla1.getEstadoAnteriorBombilla());
        System.out.println("Bombilla 2: "+bombilla2.getEstadoBombilla()+"/"+bombilla2.getEstadoAnteriorBombilla());
        System.out.println("Bombilla 3: "+bombilla3.getEstadoBombilla()+"/"+bombilla3.getEstadoAnteriorBombilla());
        System.out.println("NumBombillas: "+Bombilla.getContadorBombillas()+"\n");

        Bombilla.encenderTodasBombillas();
        System.out.println("Bombilla 1: "+bombilla1.getEstadoBombilla()+"/"+bombilla1.getEstadoAnteriorBombilla());
        System.out.println("Bombilla 2: "+bombilla2.getEstadoBombilla()+"/"+bombilla2.getEstadoAnteriorBombilla());
        System.out.println("Bombilla 3: "+bombilla3.getEstadoBombilla()+"/"+bombilla3.getEstadoAnteriorBombilla());
        System.out.println("NumBombillas: "+Bombilla.getContadorBombillas()+"\n");

        Bombilla.bajarFusibles();
        System.out.println("Bombilla 1: "+bombilla1.getEstadoBombilla()+"/"+bombilla1.getEstadoAnteriorBombilla());
        System.out.println("Bombilla 2: "+bombilla2.getEstadoBombilla()+"/"+bombilla2.getEstadoAnteriorBombilla());
        System.out.println("Bombilla 3: "+bombilla3.getEstadoBombilla()+"/"+bombilla3.getEstadoAnteriorBombilla());
        System.out.println("NumBombillas: "+Bombilla.getContadorBombillas()+"\n");

        Bombilla.arregarFusibles();
        System.out.println("Bombilla 1: "+bombilla1.getEstadoBombilla()+"/"+bombilla1.getEstadoAnteriorBombilla());
        System.out.println("Bombilla 2: "+bombilla2.getEstadoBombilla()+"/"+bombilla2.getEstadoAnteriorBombilla());
        System.out.println("Bombilla 3: "+bombilla3.getEstadoBombilla()+"/"+bombilla3.getEstadoAnteriorBombilla());
        System.out.println("NumBombillas: "+Bombilla.getContadorBombillas()+"\n");

    }
}
