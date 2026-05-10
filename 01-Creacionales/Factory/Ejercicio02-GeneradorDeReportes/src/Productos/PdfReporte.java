package Productos;

public class PdfReporte implements Reporte {

    @Override
    public void generarReporte(String reporte) {
        System.out.println("Reporte Generado en PDF: "+reporte);
    }
}
