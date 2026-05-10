package Creatores;

import Productos.MetodoPago;

public abstract class FormasPagoCreator {
    public abstract MetodoPago crearMetodoPago();
    public void emitirpago(double monto){
        if(!verificarMonto(monto)){
            System.out.println("No se puede procesar el monto");
            return;
        }
        MetodoPago metodoPago = crearMetodoPago();
        metodoPago.procesarPago(monto);
    }
    public boolean verificarMonto(double monto){
        return monto > 0;
    }
}
