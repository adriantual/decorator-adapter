package ejercicio3;

public class Especial implements Combo {

	private static String descripcion = "2 hamburguesas especiales" + "\n";
	private static double precio = 3000;

	@Override
	public String descripcion() {

		return Especial.descripcion;
	}

	@Override
	public double precio() {

		return Especial.precio;
	}

	@Override
	public void pedido() {

		double total = Especial.precio;
		String descripcion = Especial.descripcion;
		System.out.println("su pedido es: ");
		System.out.println(descripcion);
		System.out.println("total: " + total);

	}
}
