package Productos.Camioneta;

public class CamionetaElectrica extends Camioneta {
    public CamionetaElectrica() {
        super("CyberTruck", "Electrico", 180);
    }

    @Override
    public void transportar() {
        System.out.println("Transportista conducido");
        mostrarDatos();
    }
}
