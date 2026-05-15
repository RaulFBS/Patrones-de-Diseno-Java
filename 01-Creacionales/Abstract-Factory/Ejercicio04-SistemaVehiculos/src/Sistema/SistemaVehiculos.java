package Sistema;

import Fabricas.VehiculosFactory;
import Productos.Auto.Auto;
import Productos.Camioneta.Camioneta;
import Productos.Moto.Moto;

public class SistemaVehiculos {
    private VehiculosFactory vehiculosFactory;
    private Auto auto;
    private Camioneta camioneta;
    private Moto moto;
    public SistemaVehiculos(VehiculosFactory vehiculosFactory) {
        this.vehiculosFactory = vehiculosFactory;
    }
    public void probarVehiculo(){
        auto = vehiculosFactory.createAuto();
        moto = vehiculosFactory.createMoto();
        camioneta = vehiculosFactory.createCamioneta();

        auto.conducir();
        moto.arrancar();
        camioneta.transportar();

    }

}
