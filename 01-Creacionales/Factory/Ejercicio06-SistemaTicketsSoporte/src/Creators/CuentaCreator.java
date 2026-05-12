package Creators;

import Modelos.SolicitudTicket;
import Productos.TicketCuenta;
import Productos.TicketSoporte;

public class CuentaCreator extends TicketsCreator{
    @Override
    public TicketSoporte createTicketSoporte() {

        return new TicketCuenta();
    }

    @Override
    public boolean validarSolicitudTicket(SolicitudTicket solicitud) {
        if(!super.validarSolicitudTicket(solicitud)){
            return false;
        }
        String categoria = solicitud.getCategoria().toLowerCase();
        if(!(categoria.equals("cuenta") ||
                categoria.equals("login")||
                categoria.equals("seguridad"))){
            System.out.println("La categoria debe ser cuenta, login o seguridad");
            return false;
        }
        return true;
    }

}
