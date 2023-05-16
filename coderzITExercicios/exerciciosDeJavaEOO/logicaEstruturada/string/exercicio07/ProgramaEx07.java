package coderzITExercicios.exerciciosDeJavaEOO.logicaEstruturada.string.exercicio07;

import java.util.Scanner;

public class ProgramaEx07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String digitado = sc.nextLine();
		int count = digitado.length();
		String exibe = new String();
		
		for(int i = count; i!=0; i--) {
			String x;
			x = digitado.substring((i-1),i);
			exibe += x;
		}
		System.out.println(exibe);	
	}
}
