package creador;

import producto.EmailNotificacion;
import producto.Notificacion;

public class EmailCreator extends NotificacionCreator {
    @Override
    public Notificacion crearNotificacion(String mensaje) {
        return new EmailNotificacion();
    }
}
