package Fabricas;

import Productos.Boton.Boton;
import Productos.Boton.BotonOscuro;
import Productos.CajaTexto.CajaTexto;
import Productos.CajaTexto.CajaTextoOscuro;
import Productos.Checkbox.CheckBox;
import Productos.Checkbox.CheckBoxOscuro;

public class TemaOscuroFactory implements AbstractFactory{
    @Override
    public Boton createBoton() {
        return new BotonOscuro();
    }

    @Override
    public CheckBox createCheckBox() {
        return new CheckBoxOscuro();
    }

    @Override
    public CajaTexto createCajaTexto() {
        return new CajaTextoOscuro();
    }
}
