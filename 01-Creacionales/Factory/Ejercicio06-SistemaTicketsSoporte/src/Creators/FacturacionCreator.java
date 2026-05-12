package Creators;

import Modelos.SolicitudTicket;
import Productos.TicketFacturacion;
import Productos.TicketSoporte;

public class FacturacionCreator extends TicketsCreator {
    @Override
    public TicketSoporte createTicketSoporte() {

        return new TicketFacturacion();
    }

    @Override
    public boolean validarSolicitudTicket(SolicitudTicket solicitud) {
        if(!super.validarSolicitudTicket(solicitud)){
            return false;
        }
        if(solicitud.getCodigoPedido()==null||solicitud.getCodigoPedido().isEmpty()){
            System.out.println("El codigo de pedido no puede estar vacio.");
            return false;
        }
        if(!solicitud.getCodigoPedido().startsWith("PED-")){
            System.out.println("El codigo de pedido debe empezar con PED-");
            return false;
        }
        return true;

    }
}
