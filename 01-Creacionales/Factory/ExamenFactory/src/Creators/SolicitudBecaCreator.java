package Creators;

import Modelos.SolicitudDocumento;
import Productos.DocumentoAcademico;
import Productos.SolicitudBeca;

public class SolicitudBecaCreator extends DocumentoCreator {
    @Override
    public DocumentoAcademico crearDocumento() {
        return null;
    }

    @Override
    public boolean validarSolicitud(SolicitudDocumento solicitud) {
        if(!super.validarSolicitud(solicitud)){
            return false;
        }
        if(solicitud.getPromedio()<15){
            System.out.println("El promedio debe ser mayor a 15");
            return false;
        }
        if(!solicitud.isMatriculado()){
            return false;
        }
        return true;
    }
}
