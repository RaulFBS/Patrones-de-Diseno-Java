import Creators.CuentaCreator;
import Creators.TicketsCreator;
import Modelos.SolicitudTicket;
import Productos.TicketCuenta;

public class Main {
    static void main() {
        SolicitudTicket solicitud = new SolicitudTicket();
        TicketsCreator factory;
        factory = new CuentaCreator();
        factory.procesarSolicitudTicket(solicitud);
    }
}
