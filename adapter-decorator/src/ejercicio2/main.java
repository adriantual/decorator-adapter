package ejercicio2;

import java.io.File;

public class main {

	public static void main(String[] args) {
		// Report unReporte = new Report("reportee");
		// File archivo = new File("C:\\Users\\User\\Desktop\\UNIVERSIDAD 2023\\OBJETOS
		// 2\\reporteDecorador.txt");
		// unReporte.export(archivo);

		File archivo = new File("reporte");
		Exportar exportarReporte = new SobreEscribirReporte("decorador");
		exportarReporte.exportarReporte(archivo);

	}

}
