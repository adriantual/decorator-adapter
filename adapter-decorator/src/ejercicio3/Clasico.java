package ejercicio3;

public class Clasico implements Combo {

	private static String descripcion = "5 hamburguesas" + "\n" + " 5 cocas";
	private static double precio = 5000;

	@Override
	public void pedido() {

		double total = Clasico.precio;
		String descripcion = Clasico.descripcion;
		System.out.println("su pedido es: ");
		System.out.println(descripcion);
		System.out.println("total: " + total);

	}

	@Override
	public String descripcion() {

		return Clasico.descripcion;
	}

	@Override
	public double precio() {

		return Clasico.precio;
	}

}
