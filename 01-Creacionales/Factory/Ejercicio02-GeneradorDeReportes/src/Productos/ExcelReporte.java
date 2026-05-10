package Productos;

public class ExcelReporte  implements Reporte {
    @Override
    public void generarReporte(String reporte) {
        System.out.println("Reporte Generado en excel: "+reporte);
    }
}
