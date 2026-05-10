package Creatores;

import Productos.MetodoPago;
import Productos.PagoTransferencia;

public class TransferenciaCreator extends FormasPagoCreator{
    @Override
    public MetodoPago crearMetodoPago() {
        return new PagoTransferencia();
    }
}
