package Productos;

import Modelos.SolicitudTicket;

public class TicketReclamo implements TicketSoporte{
    private SolicitudTicket solicitud;
    private String prioridad;

    @Override
    public void atenderTicket(SolicitudTicket solicitud) {
        this.solicitud = solicitud;
        System.out.println("ATENDIENDO TICKET DE SOPORTE DE RECLAMO");
    }

    @Override
    public void calcularPrioridad(SolicitudTicket solicitud) {
        int urgencia= solicitud.getNivelUrgencia();
        if(urgencia==5){
            prioridad="Critica";
        }else if(urgencia>=3){
            prioridad="Alta";
        }

        System.out.println("Prioridad asignada: "+prioridad);

    }

    @Override
    public void mostrarResumen() {
        System.out.println("MOSTRAR RESUMEN DE TICKET DE RECLAMO");
        System.out.println(solicitud);
        System.out.println("Prioridad: "+prioridad);
    }
}
