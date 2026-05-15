package Productos.Camioneta;

public class CamionetaGasolina extends Camioneta {
    public CamionetaGasolina() {
        super("4X4","Gasolina",70);

    }

    @Override
    public void transportar() {
        System.out.println("Transportista conducido");
        mostrarDatos();
    }
}
