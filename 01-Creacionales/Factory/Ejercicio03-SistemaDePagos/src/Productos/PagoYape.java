package Productos;

public class PagoYape implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de s/." + monto + " con Yape.");
    }
}
