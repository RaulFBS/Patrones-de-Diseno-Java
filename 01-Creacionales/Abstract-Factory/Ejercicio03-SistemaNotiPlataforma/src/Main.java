import Cliente.Cliente;
import Fabricas.AndroidFactory;
import Fabricas.NotificacionFactory;

public class Main {
    public static void main(String[] args) {
        NotificacionFactory factory = new AndroidFactory() ;
        Cliente cliente = new Cliente(factory);
        cliente.crearNotificacion();
    }
}
