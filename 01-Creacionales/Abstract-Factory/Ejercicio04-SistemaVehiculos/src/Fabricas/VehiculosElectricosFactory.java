package Fabricas;

import Productos.Auto.Auto;
import Productos.Auto.AutoElectrico;
import Productos.Camioneta.Camioneta;
import Productos.Camioneta.CamionetaElectrica;
import Productos.Moto.Moto;
import Productos.Moto.MotoElectrica;

public class VehiculosElectricosFactory implements VehiculosFactory{
    @Override
    public Auto createAuto() {
        return new AutoElectrico();
    }

    @Override
    public Moto createMoto() {
        return new MotoElectrica();
    }

    @Override
    public Camioneta createCamioneta() {
        return new CamionetaElectrica();
    }
}
