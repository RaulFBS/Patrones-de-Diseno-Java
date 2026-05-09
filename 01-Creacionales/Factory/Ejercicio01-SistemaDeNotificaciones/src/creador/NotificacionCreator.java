package creador;

import producto.Notificacion;

public abstract class NotificacionCreator  {
   public abstract Notificacion crearNotificacion(String mensaje);
   public void enviar(String mensaje) {
       Notificacion notificacion = crearNotificacion(mensaje);
       notificacion.notificar(mensaje);
   }

}
