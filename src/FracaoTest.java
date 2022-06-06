import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;


public class FracaoTest {
	
	Fracao fracao1;
	Fracao fracao2;

	@Test
	public void divisao10_2() {
		fracao1 = new Fracao(10, 2);
		assertEquals(5, fracao1.divisao(), 0.0001);
	}

	@Test
	public void divisaoNumeradorNegativo() {
		fracao1 = new Fracao(-10, 2);
		assertEquals(-5, fracao1.divisao(), 0.0001);
	}

	@Test
	public void divisaoResultadoDecimal() {
		fracao1 = new Fracao(5, 2);
		assertEquals(2.5, fracao1.divisao(), 0.0001);
	}

	@Test
	public void divisaoResultadoDecimalDenominadorNegativo() {
		fracao1 = new Fracao(5, -2);
		assertEquals(-2.5, fracao1.divisao(), 0.0001);
	}

	@Test
	public void divisaoResultadoDecimalNumeradorEDenominadorNegativo() {
		fracao1 = new Fracao(-5, -2);
		assertEquals(2.5, fracao1.divisao(), 0.0001);
	}
	
	@Test
	public void divisaoResultadoDecimalNumeradorEDenominadorNegativoNotEquals() {
		fracao1 = new Fracao(-5, -2);
		assertNotEquals(-2.5, fracao1.divisao(), 0.0001);
	}

	@Test
	public void divisaoAssertThat() {
		fracao1 = new Fracao(-20, -2);
		assertTrue(fracao1.divisao()==10.0);
	}
	
	@Test
	public void novoTeste() {
		fracao1 = new Fracao(-50, 3);
		assertFalse(fracao1.divisao()>0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void divisaoPorZero() {
		fracao1 = new Fracao(-5, 0);
		fracao1.divisao();
	}
	
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void multiplicacaoDenominadorZero() {
		fracao1 = new Fracao(-5, 0);
		fracao2 = new Fracao(1,5);
		fracao1.multiplicação(fracao1, fracao2);
	}	
	
	@Test
	public void multiplicacao() {
		fracao1 = new Fracao(15, 2);
		fracao2 = new Fracao(1,5);
		assertEquals(1.5, fracao1.multiplicação(fracao1, fracao2), 0.0001);
	}
	
	@Test
	public void multiplicacaoNumeradorNegativo() {
		fracao1 = new Fracao(-15, 2);
		fracao2 = new Fracao(1,5);
		assertEquals(-1.5, fracao1.multiplicação(fracao1, fracao2), 0.0001);
	}
	
	@Test
	public void multiplicacaoNotEquals1() {
		fracao1 = new Fracao(55, 2);
		fracao2 = new Fracao(1,5);
		assertNotEquals(2.5, fracao1.multiplicação(fracao1, fracao2), 0.0001);
	}
	
	@Test
	public void multiplicacaoNotEquals2() {
		fracao1 = new Fracao(45, -3);
		fracao2 = new Fracao(2,1);
		assertNotEquals(30.0, fracao1.multiplicação(fracao1, fracao2), 0.0001);
	}
	
	@Test
	public void multiplicacaoNotEquals3() {
		fracao1 = new Fracao(15, 3);
		fracao2 = new Fracao(2,5);
		assertNotEquals(3.5, fracao1.multiplicação(fracao1, fracao2), 0.0001);
	}
	
	@Test
	public void multiplicacaoAssertThat() {
		fracao1 = new Fracao(-20, 2);
		fracao2 = new Fracao(2,5);
		assertTrue((fracao1.multiplicação(fracao1, fracao2))==-4.0);
				
	}
	


}