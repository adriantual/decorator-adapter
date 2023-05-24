package ejercicio1;

public class ComunMotor implements Motor {

	@Override
	public void arrancar() {
		System.out.println("arrancar");

	}

	@Override
	public void acelerar() {
		System.out.println("acelerar");

	}

	@Override
	public void apagar() {
		System.out.println("apagar");

	}

}
