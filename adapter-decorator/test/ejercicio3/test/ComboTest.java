package ejercicio3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ejercicio3.Carne;
import ejercicio3.Combo;
import ejercicio3.Familiar;
import ejercicio3.Papas;
import ejercicio3.Queso;
import ejercicio3.Tomate;

class ComboTest {

	@Test
	void combo1() {
		Combo combo = new Carne(new Queso(new Familiar()));
		assertEquals(5400.00, combo.precio());
	}

	@Test
	void combo2() {

		Combo combo = new Carne(new Queso(new Papas(new Tomate(new Familiar()))));
		assertEquals(5800.00, combo.precio());
	}
}
