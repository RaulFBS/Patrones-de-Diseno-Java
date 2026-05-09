import creador.EmailCreator;
import creador.NotificacionCreator;
import creador.SmsCreator;
import creador.WhatsappCreator;
import producto.Notificacion;

public class Main {
    public static void main(String[] args) {
        NotificacionCreator factory;
        factory =new EmailCreator();
        factory.enviar("Hola desde Email");
        factory = new SmsCreator();
        factory.enviar("Hola desde SMS");
        factory = new WhatsappCreator();
        factory.enviar("Hola desde Whatsapp");
    }

}