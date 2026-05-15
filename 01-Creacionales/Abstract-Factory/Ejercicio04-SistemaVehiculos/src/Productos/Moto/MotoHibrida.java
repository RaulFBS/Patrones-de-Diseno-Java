package Productos.Moto;

public class MotoHibrida extends Moto {
    public MotoHibrida() {
        super("Kami", "Mixto",200);
    }

    @Override
    public void arrancar() {
        System.out.println("Moto hibrida arrancando");
        mostrarDatos();
    }
}
