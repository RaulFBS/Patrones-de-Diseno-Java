package Creatores;

import Productos.MetodoPago;
import Productos.PagoPlin;

public class PlinCreator extends FormasPagoCreator{
    @Override
    public MetodoPago crearMetodoPago() {
        return new PagoPlin();
    }
}
