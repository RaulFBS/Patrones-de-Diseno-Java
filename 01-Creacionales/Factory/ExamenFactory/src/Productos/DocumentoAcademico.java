package Productos;

import Modelos.SolicitudDocumento;

public interface DocumentoAcademico {
    void generarDocumento(SolicitudDocumento solicitud);
    void calcularCosto(SolicitudDocumento solicitud);
    void mostrarResumen();
}
