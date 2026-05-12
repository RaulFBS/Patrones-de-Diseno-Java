package Creators;

import Modelos.SolicitudDocumento;
import Productos.CertificadoNotas;
import Productos.DocumentoAcademico;

public class CertificadoNotasCreator extends DocumentoCreator{
    @Override
    public DocumentoAcademico crearDocumento() {
        return new CertificadoNotas();
    }

    @Override
    public boolean validarSolicitud(SolicitudDocumento solicitud) {
        if(!super.validarSolicitud(solicitud)){
            return false;
        }
        if (solicitud.getPromedio()<0 && solicitud.getPromedio()>20){
            System.out.println("El promedio no debe ser mayor o igual a 0 y no puede ser mayor a 20");
            return false;
        }

        return true;
    }
}
