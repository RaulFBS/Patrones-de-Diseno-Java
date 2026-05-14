package Productos.Notificacion;

public class NotificacionAndroid implements Notificacion {
    @Override
    public void enviar() {
        System.out.println("Enviando notificacion estilo Android");
    }
}
