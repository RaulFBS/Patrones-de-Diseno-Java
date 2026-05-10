package Productos;


public class PagoTransferencia implements MetodoPago{
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de s/." + monto + " por transferencia bancaria.");
    }
}
