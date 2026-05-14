package Fabricas;

import Productos.Icono.Icono;
import Productos.Icono.IconoAndroid;
import Productos.Notificacion.Notificacion;
import Productos.Notificacion.NotificacionAndroid;
import Productos.Sonido.Sonido;
import Productos.Sonido.SonidoAndroid;

public class AndroidFactory implements NotificacionFactory {
    @Override
    public Icono createIcono() {
        return new IconoAndroid();
    }

    @Override
    public Notificacion createNotificacion() {
        return new NotificacionAndroid();
    }

    @Override
    public Sonido createSonido() {
        return new SonidoAndroid();
    }
}
