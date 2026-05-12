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
        String categoria = solicitud.getCategoria().toLowerCase();
        int uregencia = solicitud.getNivelUrgencia();

        if(uregencia ==5){
            prioridad = "Critica";
        }
        else if(categoria.equals("seguridad") && uregencia>=3){
            prioridad="Alta";
        }
        else if(categoria.equals("cuenta")|| categoria.equals("login")  || uregencia>=2){
            prioridad="Media";
        }
        else {

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
