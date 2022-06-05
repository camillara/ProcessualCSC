import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;


public class FracaoTest {
	
	Fracao teste;
	Fracao teste_;
	String testeString;

	@Test
	public void test1() {
		teste = new Fracao(10, 2);
		assertEquals(5, teste.divisao(), 0.0001);
	}

	@Test
	public void test2() {
		teste = new Fracao(-10, 2);
		assertEquals(-5, teste.divisao(), 0.0001);
	}

	@Test
	public void test3() {
		teste = new Fracao(5, 2);
		assertEquals(2.5, teste.divisao(), 0.0001);
	}

	@Test
	public void test4() {
		teste = new Fracao(5, -2);
		assertEquals(-2.5, teste.divisao(), 0.0001);
	}

	@Test
	public void test5() {
		teste = new Fracao(-5, -2);
		assertEquals(2.5, teste.divisao(), 0.0001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test6() {
		teste = new Fracao(-5, 0);
		teste.divisao();
	}
		
	@Test
	public void test7() {
		testeString = "50.0/-8.0";
		teste = new Fracao(10, -2);
		teste_ = new Fracao(5, 4);	
		assertTrue(testeString.equals(teste.multiplicação(teste, teste_)), teste.multiplicação(teste, teste_));
	}
	
	@Test
	public void test8() {
		testeString = "15.0/10.0";
		teste = new Fracao(3, 5);
		teste_ = new Fracao(5, 2);	
		assertTrue(testeString.equals(teste.multiplicação(teste, teste_)), teste.multiplicação(teste, teste_));
	}

	

}