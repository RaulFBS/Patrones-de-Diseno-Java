package Creatores;

import Productos.MetodoPago;
import Productos.PagoPaypal;

public class PaypalCreator extends FormasPagoCreator {

    @Override
    public MetodoPago crearMetodoPago() {
        return new PagoPaypal();
    }
}
