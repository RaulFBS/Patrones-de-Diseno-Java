package Creatores;

import Productos.MetodoPago;
import Productos.PagoPaypal;

public class TcCreator extends FormasPagoCreator {
    @Override
    public MetodoPago crearMetodoPago() {
        return new PagoPaypal();
    }
}
