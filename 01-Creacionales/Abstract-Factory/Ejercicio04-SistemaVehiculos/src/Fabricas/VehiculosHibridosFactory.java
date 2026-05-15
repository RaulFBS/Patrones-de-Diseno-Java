package Fabricas;

import Productos.Auto.Auto;
import Productos.Auto.AutoHibirido;
import Productos.Camioneta.Camioneta;
import Productos.Camioneta.CamionetaHibrida;
import Productos.Moto.Moto;
import Productos.Moto.MotoHibrida;

public class VehiculosHibridosFactory implements VehiculosFactory{
    @Override
    public Auto createAuto() {
        return new AutoHibirido();
    }

    @Override
    public Moto createMoto() {
        return new MotoHibrida();
    }

    @Override
    public Camioneta createCamioneta() {
        return new CamionetaHibrida();
    }
}
