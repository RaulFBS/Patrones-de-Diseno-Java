import Cliente.Cliente;
import Fabricas.AbstractFactory;
import Fabricas.TemaClaroFactory;

public class Main {
    static void main() {
        AbstractFactory factory = new TemaClaroFactory();
        Cliente cliente = new Cliente(factory);
        cliente.crearComponenteUI();

    }
}
