package ejercicio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SobreEscribirReporte implements Exportar {
	private String reporte;

	public SobreEscribirReporte(String reporte) {
		this.reporte = reporte;
	}

	public String get() {
		return this.reporte;
	}

	public void exportarReporte(File file) {
		if (file == null) {
			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
		}

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
			writer.write(reporte);
			System.out.println("Exportación exitosa.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error al exportar el archivo.");
		}

	}

}
