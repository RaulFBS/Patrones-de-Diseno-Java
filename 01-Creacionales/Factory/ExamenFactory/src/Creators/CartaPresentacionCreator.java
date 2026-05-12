package Creators;

import Modelos.SolicitudDocumento;
import Productos.CartaPresentacion;
import Productos.DocumentoAcademico;

public class CartaPresentacionCreator extends DocumentoCreator{
    @Override
    public DocumentoAcademico crearDocumento() {
        return new CartaPresentacion();
    }

    @Override
    public boolean validarSolicitud(SolicitudDocumento solicitud) {
        if(!super.validarSolicitud(solicitud)){
            return false;
        }
        if(solicitud.getCiclo()<5){
            System.out.println("El ciclo debe ser mayor a 5.");
            return false;
        }
        if(solicitud.getMotivo().toLowerCase().contains("practicas")){}
        return true;
    }
}
