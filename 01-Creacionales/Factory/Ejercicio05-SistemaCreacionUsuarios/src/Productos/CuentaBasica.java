package Productos;

import Modelos.RegistroUsuario;

public class CuentaBasica implements Cuenta{
    @Override
    public void activarCuenta(RegistroUsuario usuario) {
        System.out.println("Activando Cuenta");
    }

    @Override
    public void mostrarPermisos() {
        System.out.println("Mostrando Permisos");

    }
}
