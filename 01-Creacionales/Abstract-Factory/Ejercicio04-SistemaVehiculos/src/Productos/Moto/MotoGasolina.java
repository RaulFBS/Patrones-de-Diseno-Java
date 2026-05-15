package Productos.Moto;

public class MotoGasolina extends Moto {
    public MotoGasolina() {
        super("Uzumaki", "Gasolina", 250);
    }

    @Override
    public void arrancar() {
        System.out.println("Moto Gasolina arrancando");
        mostrarDatos();
    }
}
