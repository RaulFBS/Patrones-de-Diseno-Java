package Productos;

public class PagoPlin implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de S/. " + monto+ " mediante PLIN");
    }
}
