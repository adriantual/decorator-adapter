package ejercicio2;

import java.io.File;

public class NoSobreEscribirReporte implements Exportar {

	private Exportar exportarReporte;

	public NoSobreEscribirReporte(Exportar exportarReporte) {
		this.exportarReporte = exportarReporte;
	}

	@Override
	public void exportarReporte(File file) {
		if (file.exists()) {
			throw new IllegalArgumentException("El archivo ya existe...");
		}
		this.exportarReporte.exportarReporte(file);

	}

}
