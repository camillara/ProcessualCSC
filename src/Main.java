import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int sair = -1;
		while (sair != 0) {
			System.out.print("Informe o numerador: ");
			int numerador = leia.nextInt();
			System.out.print("Informe o denominador: ");
			int denominador = leia.nextInt();
			try {
			Fracao fracao = new Fracao(numerador, denominador);
			System.out.println("Resultado: " + fracao.divisao());
			}
			catch(IllegalArgumentException e) {
				System.err.println(e.getMessage());				
			}
			while (sair != 1 && sair != 0) {
				System.out.print("Selecione: [ 1 - Continuar ] [ 0 - Sair ] =>");
				sair = leia.nextInt();
			}
			System.out.println();
		}
		leia.close();
	}

}
