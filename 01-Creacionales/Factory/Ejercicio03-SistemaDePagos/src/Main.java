import Creatores.FormasPagoCreator;
import Creatores.PaypalCreator;

public class Main {
    public static void main(String[] args) {
        FormasPagoCreator factory;
        factory = new PaypalCreator();
        factory.verificarMonto(-10);

    }
}
