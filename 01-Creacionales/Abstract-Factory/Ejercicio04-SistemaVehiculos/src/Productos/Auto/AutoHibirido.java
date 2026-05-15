package Productos.Auto;

public class AutoHibirido extends Auto {
    public AutoHibirido() {
        super("Hibrido", "Mixta", 80);
    }

    @Override
    public void conducir() {
        System.out.println("Hibrido conducido");
        mostrarDatos();
    }
}
