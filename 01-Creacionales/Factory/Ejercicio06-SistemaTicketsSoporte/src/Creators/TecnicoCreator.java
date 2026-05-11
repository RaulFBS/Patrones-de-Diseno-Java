package Creators;

import Modelos.SolicitudTicket;
import Productos.TicketSoporte;

public class TecnicoCreator extends TicketsCreator{
    @Override
    public TicketSoporte createTicketSoporte() {
        return null;
    }

    @Override
    public boolean validarSolicitudTicket(SolicitudTicket solicitud) {
        return super.validarSolicitudTicket(solicitud);
    }
}
