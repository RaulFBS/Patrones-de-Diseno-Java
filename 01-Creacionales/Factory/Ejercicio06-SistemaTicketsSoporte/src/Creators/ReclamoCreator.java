package Creators;

import Modelos.SolicitudTicket;
import Productos.TicketReclamo;
import Productos.TicketSoporte;

public class ReclamoCreator extends TicketsCreator {

    @Override
    public TicketSoporte createTicketSoporte() {

        return new TicketReclamo();
    }

    @Override
    public boolean validarSolicitudTicket(SolicitudTicket solicitud) {
        if(!super.validarSolicitudTicket(solicitud)){
            return false;
        }
        int urgencia= solicitud.getNivelUrgencia();
        if (urgencia<3){
            System.out.println("El nivel urgencia debe ser mayor a 3.");
            return false;
        }
        if(solicitud.getDescripcion().length()<20){
            System.out.println("La descripcion debe ser al menos 20 caracteres.");
            return false;
        }
        return true;
    }
}
