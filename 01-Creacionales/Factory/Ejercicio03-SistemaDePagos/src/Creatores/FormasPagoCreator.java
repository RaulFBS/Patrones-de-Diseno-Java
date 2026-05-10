package Creatores;

import Productos.MetodoPago;

public abstract class FormasPagoCreator {
    public abstract MetodoPago crearMetodoPago();
    public void emitirpago(double monto){
        MetodoPago metodoPago = crearMetodoPago();
        metodoPago.procesarPago(monto);
    }
    public void verificarMonto(double monto){
        if(0>= monto){
            System.out.println("No se procesor el pago");
        }
        else {
            emitirpago(monto);
        }
    }
}
