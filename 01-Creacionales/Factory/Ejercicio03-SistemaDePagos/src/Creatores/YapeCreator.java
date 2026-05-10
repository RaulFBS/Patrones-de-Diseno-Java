package Creatores;

import Productos.MetodoPago;
import Productos.PagoTransferencia;

public class YapeCreator extends FormasPagoCreator{
    @Override
    public MetodoPago crearMetodoPago() {
        return new PagoTransferencia();
    }
}
