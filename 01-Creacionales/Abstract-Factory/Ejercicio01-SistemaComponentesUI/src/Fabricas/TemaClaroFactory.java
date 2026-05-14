package Fabricas;

import Productos.Boton.Boton;
import Productos.Boton.BotonClaro;
import Productos.CajaTexto.CajaTexto;
import Productos.CajaTexto.CajaTextoClaro;
import Productos.Checkbox.CheckBox;
import Productos.Checkbox.CheckBoxClaro;

public class TemaClaroFactory implements AbstractFactory{
    @Override
    public Boton createBoton() {
        return new BotonClaro();
    }

    @Override
    public CheckBox createCheckBox() {
        return new CheckBoxClaro();
    }

    @Override
    public CajaTexto createCajaTexto() {
        return new CajaTextoClaro();
    }
}
