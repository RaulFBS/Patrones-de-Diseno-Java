package Creators;

import Modelos.SolicitudTicket;
import Productos.TicketCuenta;
import Productos.TicketSoporte;

public class CuentaCreator extends TicketsCreator{
    @Override
    public TicketSoporte createTicketSoporte() {

        return new TicketCuenta();
    }

    @Override
    public boolean validarSolicitudTicket(SolicitudTicket solicitud) {
        return super.validarSolicitudTicket(solicitud);
    }

}
