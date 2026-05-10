package Productos;

public class PagoTc implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de s/." + monto +" con Tarjeta de credito.");
    }
}
