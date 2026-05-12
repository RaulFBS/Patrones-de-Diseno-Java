package Productos;

import Modelos.SolicitudTicket;

public class TicketTecnico implements TicketSoporte {
    private SolicitudTicket solicitud;
    private String prioridad;
    @Override
    public void atenderTicket(SolicitudTicket solicitud) {
        this.solicitud = solicitud;
        System.out.println("ATENDIENDO TICKET DE SOPORTE TECNICO");
    }

    @Override
    public void calcularPrioridad(SolicitudTicket solicitud) {
        String categoria = solicitud.getCategoria().toLowerCase();
        int uregencia = solicitud.getNivelUrgencia();

        if(uregencia ==5) {
            prioridad = "Critica";
        }
        else if( categoria.equals("sistema")&& uregencia>=3){
            prioridad="Alta";
        }
        else if(uregencia>=2){
            prioridad="Media";
        }
        else {

            prioridad="Baja";
        }
        System.out.println("Prioridad asignada: " + prioridad);

    }

    @Override
    public void mostrarResumen() {
        System.out.println("MOSTRAR RESUMEn DE TICKET TECNICO");
        System.out.println(solicitud);
        System.out.println("Prioridad: " + prioridad);
    }
}
