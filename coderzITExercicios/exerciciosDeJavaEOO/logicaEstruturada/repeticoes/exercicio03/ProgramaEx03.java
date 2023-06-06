package coderzITExercicios.exerciciosDeJavaEOO.logicaEstruturada.repeticoes.exercicio03;

import java.util.Scanner;

public class ProgramaEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menor = new String();
		String maior = new String();
		String primeiroNumero = String.valueOf(sc.nextInt());
		String segundoNumero = String.valueOf(sc.nextInt());

		// somente numeros positivos
		if (Integer.valueOf(primeiroNumero) >= 0 & Integer.valueOf(segundoNumero) >= 0) {

		} else {
			System.out.println("|============================|\n" + "| ERROR 666 - Valor inválido |\n"
					+ "|----------------------------|\n" + "|  Somente valores positivos |\n"
					+ "|============================|\n" + "\n Digite novamente: ");
			primeiroNumero = String.valueOf(sc.nextInt());
			segundoNumero = String.valueOf(sc.nextInt());
		}
		sc.close();

		// mesma quantidade de caracter em ambos os numeros
		if (primeiroNumero.length() == segundoNumero.length()) {
			if (Integer.valueOf(primeiroNumero) > Integer.valueOf(segundoNumero)) {
				maior = primeiroNumero;
				menor = segundoNumero;
			} else {
				maior = segundoNumero;
				menor = primeiroNumero;
			}
		}

		// qual string tem menos caracter
		if (primeiroNumero.length() > segundoNumero.length()) {
			int diferenca = primeiroNumero.length() - segundoNumero.length();
			menor = segundoNumero;
			maior = primeiroNumero;

			// menor caracter recebe zero para igualar caracteres
			for (int i = 0; i < diferenca; i++) {
				menor += 0;
			}
		}

		if (primeiroNumero.length() < segundoNumero.length()) {
			int diferenca = segundoNumero.length() - primeiroNumero.length();
			menor = primeiroNumero;
			maior = segundoNumero;

			// menor caracter recebe zero para igualar caracteres
			for (int i = 0; i < diferenca; i++) {
				menor += 0;
			}
		}

		while (!menor.isEmpty()) {

			// se maior conter x de menor, apague x maior e x menor
			if (maior.contains(menor.substring(0, 1))) {
				maior = maior.replaceFirst(menor.substring(0, 1), "");
				menor = menor.replaceFirst(menor.substring(0, 1), "");
				// maior e menor estiverem vazios entao e permutacao
				if (menor.isEmpty() & maior.isEmpty()) {
					System.out.println(primeiroNumero + " é permutação de: " + segundoNumero);
				}

			} else {

				System.out.println(primeiroNumero + " não é permutação do " + segundoNumero);
				break;
			}

		}

	}

}
