package Productos;

import Modelos.SolicitudTicket;

public interface TicketSoporte {
    void atenderTicket(SolicitudTicket solicitud);
    void calcularPrioridad(SolicitudTicket solicitud);
    void mostrarResumen();
}
