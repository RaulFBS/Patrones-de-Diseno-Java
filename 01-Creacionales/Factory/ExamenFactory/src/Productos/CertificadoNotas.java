package Productos;

import Modelos.SolicitudDocumento;

public class CertificadoNotas implements DocumentoAcademico{
    SolicitudDocumento solicitud;
    private double precio;
    @Override
    public void generarDocumento(SolicitudDocumento solicitud) {
        System.out.println("Generando  Certificado Notas");
    }

    @Override
    public void calcularCosto(SolicitudDocumento solicitud) {
        System.out.println("Calculando  Costo");
        precio = 150;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Mostrando Resumen");
        System.out.println(solicitud);
        System.out.println("Precio: "+precio);

    }
}
