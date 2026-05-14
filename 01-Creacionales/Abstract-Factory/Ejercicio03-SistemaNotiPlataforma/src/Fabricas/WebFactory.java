package Fabricas;

import Productos.Icono.Icono;
import Productos.Icono.IconoWeb;
import Productos.Notificacion.Notificacion;
import Productos.Notificacion.NotificacionWeb;
import Productos.Sonido.Sonido;
import Productos.Sonido.SonidoWeb;

public class WebFactory  implements NotificacionFactory{
    @Override
    public Icono createIcono() {
        return new IconoWeb();
    }

    @Override
    public Notificacion createNotificacion() {
        return new NotificacionWeb();
    }

    @Override
    public Sonido createSonido() {
        return new SonidoWeb();
    }
}
