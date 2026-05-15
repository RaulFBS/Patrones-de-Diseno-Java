package Fabricas;

import Productos.Auto.Auto;
import Productos.Camioneta.Camioneta;
import Productos.Moto.Moto;

public interface VehiculosFactory {
    Auto createAuto();
    Moto createMoto();
    Camioneta createCamioneta();
}
