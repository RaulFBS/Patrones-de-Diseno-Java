package Productos;

import Modelos.SolicitudDocumento;

public class ConstanciaMatricula implements DocumentoAcademico{
    SolicitudDocumento solicitud;
    private double precio;
    @Override
    public void generarDocumento(SolicitudDocumento solicitud) {
        this.solicitud = solicitud;
        System.out.println("Generando  Constancia Matricula");
    }

    @Override
    public void calcularCosto(SolicitudDocumento solicitud) {
        System.out.println("Calculando Costo");
        precio = 200.00;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Mostrando Resumen");
        System.out.println(solicitud);
        System.out.println("Costo: " + precio);
    }
}
