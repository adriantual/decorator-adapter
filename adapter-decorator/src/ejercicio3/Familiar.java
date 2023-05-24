package ejercicio3;

public class Familiar implements Combo {

	private static String descripcion = "5 hamburguesas" + "\n" + "5 cocas";
	private static double precio = 5000;

	@Override
	public String descripcion() {

		return Familiar.descripcion;
	}

	@Override
	public double precio() {

		return Familiar.precio;
	}

	@Override

	public void pedido() {

		double total = Familiar.precio;
		String descripcion = Familiar.descripcion;
		System.out.println("su pedido es: ");
		System.out.println(descripcion);
		System.out.println("total: " + total);

	}

}
