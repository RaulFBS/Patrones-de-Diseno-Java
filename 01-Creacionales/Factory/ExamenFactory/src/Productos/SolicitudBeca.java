package Productos;

import Modelos.SolicitudDocumento;

public class SolicitudBeca implements DocumentoAcademico{
    private SolicitudDocumento solicitud;
    private double precio;
    @Override
    public void generarDocumento(SolicitudDocumento solicitud) {
        this.solicitud = solicitud;
        System.out.println("Generando Solicitud de Beca");
    }

    @Override
    public void calcularCosto(SolicitudDocumento solicitud) {
        System.out.println("Calculando Costo de Beca");
        precio = 0;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Mostrando Resumen");
        System.out.println(solicitud);
        System.out.println("Precio: " + precio);
    }
}
