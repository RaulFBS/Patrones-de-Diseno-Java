import Fabricas.VehiculosElectricosFactory;
import Fabricas.VehiculosFactory;

import Sistema.SistemaVehiculos;

public class Main {
    static void main() {
        VehiculosFactory factory = new VehiculosElectricosFactory();
        SistemaVehiculos cliente = new   SistemaVehiculos(factory);
        cliente.probarVehiculo();
    }

}
