package Creators;

import Modelos.SolicitudTicket;
import Productos.TicketSoporte;
import Productos.TicketTecnico;

public class TecnicoCreator extends TicketsCreator{
    @Override
    public TicketSoporte createTicketSoporte() {

        return new TicketTecnico();
    }

    @Override
    public boolean validarSolicitudTicket(SolicitudTicket solicitud) {
        if( !super.validarSolicitudTicket(solicitud)){
            return false;
        }
        String categoria = solicitud.getCategoria().toLowerCase();
        if(!(categoria.equals("tecnico")||categoria.equals("sistema"))){
            System.out.println("La categoria debe ser tecnico o sistema");
            return false;
        }
        return true;

    }
}
