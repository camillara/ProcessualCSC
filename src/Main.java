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
			sair=-1;
			while (sair != 1 && sair != 0) {
				System.out.print("Selecione: [ 1 - Continuar ] [ 0 - Sair ] =>");
				sair = leia.nextInt();
			}
			System.out.println();
		}
		System.out.println("Sistema encerrado com sucesso!");
		
		sair = -1;
		while (sair != 0) {
			try {
			System.out.println("MULTIPLICAÇÃO DE FRAÇÕES\n");
			System.out.print("Informe o numerador da 1ª fração: ");
			int numerador = leia.nextInt();
			System.out.print("Informe o denominador da 1ª fração: ");
			int denominador = leia.nextInt();
			Fracao fracao1 = new Fracao(numerador, denominador);
			System.out.print("Informe o numerador da 2ª fração: ");
			numerador = leia.nextInt();
			System.out.print("Informe o denominador da 2ª fração: ");			
			denominador = leia.nextInt();		
			Fracao fracao2= new Fracao(numerador, denominador);
			System.out.println("Resultado: " + fracao1.multiplicação(fracao1, fracao2));
			}
			catch(IllegalArgumentException e) {
				System.err.println(e.getMessage());				
			}
			sair=-1;
			while (sair != 1 && sair != 0) {
				System.out.print("Selecione: [ 1 - Continuar ] [ 0 - Sair ] =>");
				sair = leia.nextInt();
			}
			System.out.println();
		}
		System.out.print("Sistema encerrado com sucesso!");
		
		leia.close();
	}

}
