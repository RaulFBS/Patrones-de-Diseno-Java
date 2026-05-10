import Creatores.FormasPagoCreator;
import Creatores.PaypalCreator;
import Creatores.PlinCreator;

public class Main {
    public static void main(String[] args) {
        FormasPagoCreator factory;
        factory = new PaypalCreator();
        factory.emitirpago(-10);
        factory = new PlinCreator();
        factory.emitirpago(200);

    }
}
