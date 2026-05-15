package Fabricas;

import Productos.Auto.Auto;
import Productos.Auto.AutoGasolina;
import Productos.Camioneta.Camioneta;
import Productos.Camioneta.CamionetaGasolina;
import Productos.Moto.Moto;
import Productos.Moto.MotoGasolina;

public class VehiculosGasolinaFactory implements VehiculosFactory{
    @Override
    public Auto createAuto() {
        return new AutoGasolina();
    }

    @Override
    public Moto createMoto() {
        return new MotoGasolina();
    }

    @Override
    public Camioneta createCamioneta() {
        return new CamionetaGasolina();
    }
}
