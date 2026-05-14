package Cliente;

import Fabricas.NotificacionFactory;
import Productos.Icono.Icono;
import Productos.Notificacion.Notificacion;
import Productos.Sonido.Sonido;

public class Cliente {
    private NotificacionFactory factory;
    private Icono icono;
    private Notificacion notificacion;
    private Sonido sonido;
    public Cliente(NotificacionFactory factory) {
        this.factory = factory;
    }

    public void crearNotificacion() {
        icono = factory.createIcono();
        sonido = factory.createSonido();
        notificacion = factory.createNotificacion();
        System.out.println("Creando notificacion");
        icono.mostrar();
        sonido.reproducir();
        notificacion.enviar();
    }
}
