package Productos;

import Modelos.SolicitudDocumento;

public class CartaPresentacion implements DocumentoAcademico{
    private SolicitudDocumento solicitud;
    private double precio;
    @Override
    public void generarDocumento(SolicitudDocumento solicitud) {
        this.solicitud = solicitud;
        System.out.println("Generando carta de presentacion");
    }

    @Override
    public void calcularCosto(SolicitudDocumento solicitud) {
        System.out.println("Calculando costo de  carta de presentacion");
        precio = 50;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Mostrando Resumen");
        System.out.println(solicitud);
        System.out.println("Precio: " + precio);


    }
}
