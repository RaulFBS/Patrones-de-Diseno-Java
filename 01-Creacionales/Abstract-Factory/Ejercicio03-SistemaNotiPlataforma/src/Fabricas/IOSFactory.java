package Fabricas;

import Productos.Icono.Icono;
import Productos.Icono.IconoIOS;
import Productos.Notificacion.Notificacion;
import Productos.Notificacion.NotificacionIOS;
import Productos.Sonido.Sonido;
import Productos.Sonido.SonidoIOS;

public class IOSFactory implements NotificacionFactory {
    @Override
    public Icono createIcono() {
        return new IconoIOS();
    }

    @Override
    public Notificacion createNotificacion() {
        return new NotificacionIOS();
    }

    @Override
    public Sonido createSonido() {
        return new SonidoIOS();
    }
}
