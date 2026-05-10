package Creator;

import Productos.PdfReporte;
import Productos.Reporte;

public class PdfCreator extends ReportesCreator{
    @Override
    public Reporte crearReporte() {
        return new PdfReporte();
    }
}
