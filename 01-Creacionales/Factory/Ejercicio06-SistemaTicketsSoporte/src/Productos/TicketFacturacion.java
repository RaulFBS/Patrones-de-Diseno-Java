package Productos;

import Modelos.SolicitudTicket;

public class TicketFacturacion implements TicketSoporte{
    private SolicitudTicket solicitud;
    private String prioridad;
    @Override
    public void atenderTicket(SolicitudTicket solicitud) {
        this.solicitud = solicitud;
        System.out.println("ATENDIENDO TICKET DE SOPORTE DE CUENTA");
    }

    @Override
    public void calcularPrioridad(SolicitudTicket solicitud) {
        //Agregar el calculo dependiendo si es cliente premium o no
        int urgencia = solicitud.getNivelUrgencia();
        if(urgencia == 5){
            prioridad="Critica";
        }
        else if(solicitud.isClientePremium()&& urgencia >= 3){
            prioridad = "Alta";

        }else if(urgencia >= 2){
            prioridad = "media";
        }else {
            prioridad = "baja";
        }
        System.out.println("Prioridad asignada: " + prioridad);
    }

    @Override
    public void mostrarResumen() {
        System.out.println("MOSTRAR RESUMEN DE TICKET DE FACTURACION");
        System.out.println( solicitud);
        System.out.println("Prioridad: " + prioridad);

    }
}
