package Creators;

import Modelos.SolicitudDocumento;
import Productos.DocumentoAcademico;

public abstract class DocumentoCreator {
    public abstract DocumentoAcademico crearDocumento();
    public void procesarSolicitud(SolicitudDocumento solicitud) {
        if(!validarSolicitud(solicitud)) {
            System.out.println("Solicitud invalida");
            return;
        }
        DocumentoAcademico documento = crearDocumento();
        documento.generarDocumento(solicitud);
        documento.calcularCosto(solicitud);
        documento.mostrarResumen();

    }
    public boolean validarSolicitud(SolicitudDocumento solicitud) {
        if(solicitud == null) {
            return false;
        }
        if(!solicitud.isValido()){
            return false;
        }
        return true;
    }
}
