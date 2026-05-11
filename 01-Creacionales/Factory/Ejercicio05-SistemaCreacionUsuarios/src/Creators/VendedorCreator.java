package Creators;

import Modelos.RegistroUsuario;
import Productos.Cuenta;
import Productos.CuentaVendedor;

public class VendedorCreator extends CuentasCreator{
    @Override
    public Cuenta crearCuenta() {
        return new CuentaVendedor();
    }

    @Override
    public boolean validarCuenta(RegistroUsuario usuario) {
        if (!super.validarCuenta(usuario)){
            return false;
        }
        if(usuario.getRuc().isEmpty()||usuario.getRuc().equals("")){
            System.out.println("El ruc no debe estar vacio");
            return false;
        }
        if(usuario.getRuc().length()<11){
            System.out.println("El ruc debe tener 11 digitos");
        }
        return true;
    }
}
