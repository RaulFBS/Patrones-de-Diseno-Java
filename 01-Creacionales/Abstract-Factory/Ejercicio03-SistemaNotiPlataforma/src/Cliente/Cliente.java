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
        this.icono = factory.createIcono();
        this.sonido = factory.createSonido();
        this.notificacion = factory.createNotificacion();
    }

    public void crearNotificacion() {
        System.out.println("Creando notificacion");
        icono.mostrar();
        sonido.reproducir();
        notificacion.enviar();
    }
}
