package Productos;

import Modelos.SolicitudTicket;

public class TicketFacturacion implements TicketSoporte{
    private SolicitudTicket solicitud;
    private String prioridad;
    @Override
    public void atenderTicket(SolicitudTicket solicitud) {
        System.out.println("ATENDIENDO TICKET DE SOPORTE DE CUENTA");
    }

    @Override
    public void calcularPrioridad(SolicitudTicket solicitud) {
        //Agregar el calculo dependiendo si es cliente premium o no
        

    }

    @Override
    public void mostrarResumen() {

    }
}
