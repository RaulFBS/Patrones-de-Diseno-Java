package Productos;

public class PagoPaypal implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de s/." + monto + " en PayPal");
    }
}
