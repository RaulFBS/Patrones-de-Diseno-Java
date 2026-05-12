package Creators;

import Modelos.SolicitudDocumento;
import Productos.ConstanciaMatricula;
import Productos.DocumentoAcademico;

public class ConstanciaMatriculaCreator extends DocumentoCreator{
    @Override
    public DocumentoAcademico crearDocumento() {
        return new ConstanciaMatricula();
    }

    @Override
    public boolean validarSolicitud(SolicitudDocumento solicitud) {
        if(!super.validarSolicitud(solicitud)){
            return false;
        }
        if(!solicitud.isMatriculado()){
            System.out.println("El estudiante no esta matriculado.");
            return false;
        }
        if(solicitud.getCiclo()<1){
            System.out.println("El estudiante no esta ciclo.");
            return false;
        }
        return true;
    }
}
