package ejercicio1;

public class Main {

	public static void main(String[] args) {

		Motor motorComun = new ComunMotor();
		Motor motorEconomico = new EconomicoMotor();
		Motor motorAdapter = new Adapter(new MotorElectrico());

		motorAdapter.acelerar();
		motorAdapter.arrancar();
		motorAdapter.apagar();

		motorComun.arrancar();
		motorComun.acelerar();
		motorComun.apagar();

		motorEconomico.arrancar();
		motorEconomico.acelerar();
		motorEconomico.apagar();

	}

}
