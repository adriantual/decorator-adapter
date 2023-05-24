package ejercicio2.test;

import java.io.File;

import org.junit.jupiter.api.Test;

import ejercicio2.Exportar;
import ejercicio2.NoSobreEscribirReporte;
import ejercicio2.SobreEscribirReporte;

class ReportTest {

	@Test
	void test() {
		/*
		 * Report unReporte = new Report("reportee"); File archivo = new
		 * File("C:\\Users\\User\\Desktop\\UNIVERSIDAD 2023\\OBJETOS 2\\reporteDecorador.txt"
		 * );
		 * 
		 * unReporte.ex
		 */
	}

	@Test
	void sobreEscribir() {

		File archivo = new File("reporte");
		Exportar exportarReporte = new SobreEscribirReporte("decorador");
		exportarReporte.exportarReporte(archivo);

	}

	@Test
	void noSobreEscribir() {
		File archivo = new File("reporte");
		Exportar exportarReporte = new NoSobreEscribirReporte(new SobreEscribirReporte("decorador"));
		exportarReporte.exportarReporte(archivo);

	}

}
