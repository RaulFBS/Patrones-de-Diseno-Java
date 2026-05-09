package creador;

import producto.Notificacion;
import producto.WhatsappNotificacion;

public class WhatsappCreator extends NotificacionCreator {
    @Override
    public Notificacion crearNotificacion(String mensaje) {
        return new WhatsappNotificacion();
    }
}
