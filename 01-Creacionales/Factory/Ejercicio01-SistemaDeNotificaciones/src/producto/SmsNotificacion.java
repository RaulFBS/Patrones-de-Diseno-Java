package producto;

public class SmsNotificacion implements Notificacion{

    @Override
    public void notificar(String mensaje) {
        System.out.println("Enviando Sms: "+mensaje);
    }
}
