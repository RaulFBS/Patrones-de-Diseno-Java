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
        String motivo = solicitud.getMotivo().toLowerCase();
        if(!super.validarSolicitud(solicitud)){
            return false;
        }
        if(solicitud.getCiclo()<5){
            System.out.println("El ciclo debe ser mayor a 5.");
            return false;
        }

        if(!(motivo.contains("practicas")||motivo.contains("trabajo")||motivo.contains("empresa"))){
            System.out.println("El motivo de contener la palabra 'Practicas','Trabajo' o 'Empresa' .");
            return false;
        }

        return true;
    }
}
