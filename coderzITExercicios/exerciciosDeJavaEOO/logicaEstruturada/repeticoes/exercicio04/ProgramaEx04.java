package coderzITExercicios.exerciciosDeJavaEOO.logicaEstruturada.repeticoes.exercicio04;

import java.util.Scanner;

public class ProgramaEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 		
		double random = (Math.random()*100)+ 1;
		int numSorteado = (int)random;
		int numDigitado = 0;
		long tempoStart,tempoEnd;
		int tempoGasto;

		System.out.println("Digite o número que aparecerá após o 'Agora!', seja rápido !");
		
		tempoStart = System.currentTimeMillis();

		for(int i=0; i<random; i++) {System.out.print(".");}
		
		System.out.println("\n--> Agora! <--");
		System.out.println("  --> "+ numSorteado +" <--");
		do {
			System.out.print("\n digite: ");
			numDigitado = sc.nextInt();
		} while(numDigitado != numSorteado);

		tempoEnd = System.currentTimeMillis();
		tempoGasto = (int)(tempoEnd - tempoStart)/1000;

		System.out.println("Você demorou '"+tempoGasto+"' segundos, para digitar o número.");
	}
}