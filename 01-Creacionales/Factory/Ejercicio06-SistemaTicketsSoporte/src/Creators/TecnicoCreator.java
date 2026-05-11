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
        return super.validarSolicitudTicket(solicitud);
    }
}
