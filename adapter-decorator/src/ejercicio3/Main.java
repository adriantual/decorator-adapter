package ejercicio3;

public class Main {

	public static void main(String[] args) {

		Combo unCombo = new Familiar();
		Combo unCombo1 = new Clasico();
		Combo unCombo2 = new Especial();

		Combo adicional1 = new Carne(new Queso(new Familiar()));
		Combo adicional2 = new Queso(unCombo);

		adicional1.pedido();

	}

}
