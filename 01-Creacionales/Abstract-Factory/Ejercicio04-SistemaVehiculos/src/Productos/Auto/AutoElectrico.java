package Productos.Auto;

public class AutoElectrico extends Auto{

    public AutoElectrico() {
        super("Tesla", "Electrica", 100);
    }

    @Override
    public void conducir() {
        System.out.println("AutoElectrico conducido");
        mostrarDatos();

    }
}
