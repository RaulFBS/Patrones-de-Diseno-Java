package Productos;

import Modelos.SolicitudTicket;

public class TicketCuenta implements TicketSoporte{
    private String prioridad;
    private SolicitudTicket solicitud;
    @Override
    public void atenderTicket(SolicitudTicket solicitud) {
        System.out.println("ATENDIENDO TICKET DE SOPORTE DE CUENTA");
    }

    @Override
    public void calcularPrioridad(SolicitudTicket solicitud) {
        
    }

    @Override
    public void mostrarResumen() {
        System.out.println("MOSTRAR RESUMEN De TICKET DE CUENTA");
        System.out.println(solicitud);
        System.out.println("Prioridad : "+ prioridad);
    }
}
