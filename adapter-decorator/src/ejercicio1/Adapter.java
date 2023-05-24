package ejercicio1;

public class Adapter implements Motor {
	private MotorElectrico motorElectrico;

	public Adapter(MotorElectrico motorElectrico) {
		super();
		this.motorElectrico = motorElectrico;
	}

	@Override
	public void arrancar() {
		motorElectrico.conectarActivar();

	}

	@Override
	public void acelerar() {
		motorElectrico.moverMasRapido();

	}

	@Override
	public void apagar() {
		motorElectrico.detenerDesconectar();

	}

}
