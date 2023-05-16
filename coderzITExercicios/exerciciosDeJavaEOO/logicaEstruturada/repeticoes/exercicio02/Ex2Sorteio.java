package coderzITExercicios.exerciciosDeJavaEOO.logicaEstruturada.repeticoes.exercicio02;

import java.util.Scanner;

public class Ex2Sorteio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double random = Math.random()*1002;
		int numSorteado = (int)random;
		int palpite;
		int count = 0;
	System.out.println("Adivinhe um número de 0 a 1000");
	
	do {
		palpite = sc.nextInt();
		if(palpite > numSorteado){
			System.out.println("Quase acertou! O número sorteado é menor que "+ palpite +". Digite de novo ..");
		} if(palpite < numSorteado) {
			System.out.println("Quase acertou! O número sorteado é maior que "+ palpite +". Digite de novo ..");
		};
		count++;
		
		//codigo para sair do loop 9999 ps: criei para testar e nao perder tempo
		if(palpite == 9999) { break;}
		
	} while(palpite != numSorteado);
		
		System.out.println("PARABÉNS! O número sorteado foi "+numSorteado +", e você tentou "+count+" vezes!");
	}
}
 