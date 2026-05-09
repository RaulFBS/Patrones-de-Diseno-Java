package producto;

public class WhatsappNotificacion implements Notificacion{
    @Override
    public void notificar(String mensaje) {
        System.out.println("Enviando Whatsapp: "+mensaje);
    }
}
