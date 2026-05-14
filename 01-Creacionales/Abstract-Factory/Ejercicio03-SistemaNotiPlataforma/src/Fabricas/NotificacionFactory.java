package Fabricas;

import Productos.Icono.Icono;
import Productos.Notificacion.Notificacion;
import Productos.Sonido.Sonido;

public interface NotificacionFactory {
    Icono createIcono();
    Notificacion createNotificacion();
    Sonido createSonido();
}
