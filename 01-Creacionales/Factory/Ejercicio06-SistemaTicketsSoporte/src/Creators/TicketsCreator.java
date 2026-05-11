package Creators;

import Modelos.SolicitudTicket;
import Productos.TicketSoporte;

public abstract class TicketsCreator {
    public abstract TicketSoporte createTicketSoporte();
    public void procesarSolicitudTicket(SolicitudTicket solicitud) {

    }
    public boolean validarSolicitudTicket(SolicitudTicket solicitud) {
        return true;
    }
}
