package Creator;

import Productos.ExcelReporte;
import Productos.Reporte;
import Productos.WordReporte;

public class WordCreator extends ReportesCreator{
    @Override
    public Reporte crearReporte(String reporte) {
        return new WordReporte();
    }
}
