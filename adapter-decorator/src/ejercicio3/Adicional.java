package ejercicio3;

public abstract class Adicional implements Combo {

	protected Double Precio;
	protected String descripcion;
	protected Combo unCombo;

	public Adicional(Double precio, String descripcion, Combo unCombo) {
		super();
		Precio = precio;
		this.descripcion = descripcion;
		this.unCombo = unCombo;
	}

	@Override
	public void pedido() {
		System.out.println("su pedido es: ");
		System.out.println(this.descripcion());
		System.out.println("total: " + this.precio());

	}

	@Override
	public String descripcion() {
		String descrip = this.unCombo.descripcion() + "\n" + this.descripcion;
		return descrip;
	}

	@Override
	public double precio() {
		double total = this.unCombo.precio() + this.Precio;
		return total;
	}

}
