package Creators;

import Modelos.SolicitudTicket;
import Productos.TicketFacturacion;
import Productos.TicketSoporte;

public class FacturacionCreator extends TicketsCreator {
    @Override
    public TicketSoporte createTicketSoporte() {

        return new TicketFacturacion();
    }

    @Override
    public boolean validarSolicitudTicket(SolicitudTicket solicitud) {
        return super.validarSolicitudTicket(solicitud);
    }
}
