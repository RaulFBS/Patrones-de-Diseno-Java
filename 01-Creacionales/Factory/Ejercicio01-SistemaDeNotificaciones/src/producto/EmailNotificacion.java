package producto;

import creador.NotificacionCreator;

public class EmailNotificacion implements Notificacion{
    @Override
    public void notificar(String mensaje) {
        System.out.println("Enviando Email: "+ mensaje);
    }
}
