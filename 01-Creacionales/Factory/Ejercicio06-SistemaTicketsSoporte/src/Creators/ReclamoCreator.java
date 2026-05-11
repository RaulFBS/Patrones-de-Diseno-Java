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
        return super.validarSolicitudTicket(solicitud);
    }
}
