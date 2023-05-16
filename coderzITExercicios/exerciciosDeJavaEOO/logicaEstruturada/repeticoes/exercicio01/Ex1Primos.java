package coderzITExercicios.exerciciosDeJavaEOO.logicaEstruturada.repeticoes.exercicio01;

import java.util.Scanner;

public class Ex1Primos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		int contador = 0;
		
		System.out.print("Digite um número inteiro --> ");
		N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				contador++;
			}
		}
		
		if(contador == 2) {
			System.out.println(" O número "+ N +" é primo! ");
		} else {
		System.out.println(" O número "+ N +" NÃO é primo! ");
		}
	}
}

 