package creador;

import producto.EmailNotificacion;
import producto.Notificacion;
import producto.SmsNotificacion;

public class SmsCreator extends NotificacionCreator {
    @Override
    public Notificacion crearNotificacion(String mensaje) {
        return new SmsNotificacion();
    }
}
