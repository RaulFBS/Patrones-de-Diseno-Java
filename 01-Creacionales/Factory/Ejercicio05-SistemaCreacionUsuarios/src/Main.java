import Creators.*;
import Modelos.RegistroUsuario;


public class Main {
    static void main() {
        RegistroUsuario usuario = new RegistroUsuario();
        CuentasCreator factory;
        factory = new BasicaCreator();
        factory.registrarCuenta(usuario);
        System.out.println("-------------------------------------");

        RegistroUsuario usuario2 = new RegistroUsuario("Raul","ddwdqqdq@","ddawdawd",13,0,"");
        factory.registrarCuenta(usuario2);
        System.out.println("-------------------------------------");
        CuentasCreator factory2;
        factory2 = new PremiumCreator();
        factory2.registrarCuenta(usuario2);

        System.out.println("------------------------------------");
        CuentasCreator factory3;
        factory3 = new VendedorCreator();
        factory3.registrarCuenta(usuario2);

        System.out.println("-----------------------------------");
        CuentasCreator factory4;
        factory4 = new AdministradorCreator();
        factory4.registrarCuenta(usuario2);


    }
}
