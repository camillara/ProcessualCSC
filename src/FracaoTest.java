import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class FracaoTest {

	@Test
	public void test1() {
		Fracao teste1 = new Fracao(10, 2);
		assertEquals(5, teste1.divisao(), 0.0001);
	}

	@Test
	public void test2() {
		Fracao teste2 = new Fracao(-10, 2);
		assertEquals(-5, teste2.divisao(), 0.0001);
	}

	@Test
	public void test3() {
		Fracao teste3 = new Fracao(5, 2);
		assertEquals(2.5, teste3.divisao(), 0.0001);
	}

	@Test
	public void test4() {
		Fracao teste4 = new Fracao(5, -2);
		assertEquals(-2.5, teste4.divisao(), 0.0001);
	}

	@Test
	public void test5() {
		Fracao teste5 = new Fracao(-5, -2);
		assertEquals(2.5, teste5.divisao(), 0.0001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test6() {
		Fracao teste6 = new Fracao(-5, 0);
		teste6.divisao();
	}

}