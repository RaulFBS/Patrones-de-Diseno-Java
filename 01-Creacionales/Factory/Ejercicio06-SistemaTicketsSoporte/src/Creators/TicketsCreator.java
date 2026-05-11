package Creators;

import Modelos.SolicitudTicket;
import Productos.TicketSoporte;

public abstract class TicketsCreator {
    public abstract TicketSoporte createTicketSoporte();
    public void procesarSolicitudTicket(SolicitudTicket solicitud) {
        if (!validarSolicitudTicket(solicitud)) {
            System.out.println("Error al procesar SolicitudTicket");
            return;
        }
        TicketSoporte ticket = createTicketSoporte();

        ticket.atenderTicket(solicitud);
        ticket.calcularPrioridad(solicitud);
        ticket.mostrarResumen();



    }
    public boolean validarSolicitudTicket(SolicitudTicket solicitud) {
        if (solicitud == null) {
            return false;
        }
        if (!solicitud.isValido()){
            return false;
        }
        return true;
    }
}
