package Productos.Moto;

public class MotoElectrica extends Moto {
    public MotoElectrica() {
        super("China", "Electrica", 160);
    }

    @Override
    public void arrancar() {
        System.out.println("Moto Electrica arrancando");
        mostrarDatos();
    }
}
