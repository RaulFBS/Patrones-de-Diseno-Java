package Productos;

import Modelos.SolicitudTicket;

public class TicketCuenta implements TicketSoporte{
    private String prioridad;
    private SolicitudTicket solicitud;
    @Override
    public void atenderTicket(SolicitudTicket solicitud) {
        this.solicitud = solicitud;
        System.out.println("ATENDIENDO TICKET DE SOPORTE DE CUENTA");
    }

    @Override
    public void calcularPrioridad(SolicitudTicket solicitud) {
        if(solicitud.getCategoria().equals("seguridad")){
            prioridad="Alta";
        }
        else if(solicitud.getCategoria().equals("cuenta")){
            prioridad="Media";
        }
        else if(solicitud.getCategoria().equals("login")){
            prioridad="Baja";
        }
    }

    @Override
    public void mostrarResumen() {
        System.out.println("MOSTRAR RESUMEN De TICKET DE CUENTA");
        System.out.println(solicitud);
        System.out.println("Prioridad : "+ prioridad);
    }
}
