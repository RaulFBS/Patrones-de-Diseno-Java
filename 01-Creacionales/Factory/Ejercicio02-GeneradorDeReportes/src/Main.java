import Creator.ExcelCreator;
import Creator.PdfCreator;
import Creator.ReportesCreator;
import Creator.WordCreator;

public class Main {
    public static void main(String[] args) {
        ReportesCreator factory;
        factory = new ExcelCreator();
        factory.generarReporte("Reporte Generado en Excel");
        factory = new WordCreator();
        factory.generarReporte("Reporte Generado en Word");
        factory = new PdfCreator();
        factory.generarReporte("Reporte Generado en Pdf");

    }
}
