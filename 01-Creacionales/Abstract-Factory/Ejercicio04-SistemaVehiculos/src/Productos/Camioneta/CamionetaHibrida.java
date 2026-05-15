package Productos.Camioneta;

public class CamionetaHibrida extends Camioneta {
    public CamionetaHibrida() {
        super("CamionetaHibrida","Mixta",50);
    }

    @Override
    public void transportar() {
        System.out.println("Transportista conducido");
        mostrarDatos();
    }
}
