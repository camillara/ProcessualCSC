public class Fracao {

	private final int NUMERADOR;
	private final int DENOMINADOR;

	public Fracao(int numerador, int denominador) {
		if(denominador == 0) {
			throw new IllegalArgumentException("O denominador não pode ser igual a zero");
		}
		NUMERADOR = numerador;
		DENOMINADOR = denominador;
	}

	public int getNUMERADOR() {
		return NUMERADOR;
	}

	public int getDENOMINADOR() {
		return DENOMINADOR;
	}

	public Double divisao() {
		return (double) NUMERADOR / DENOMINADOR;
	}

}
