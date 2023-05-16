package coderzITExercicios.exerciciosDeJavaEOO.logicaEstruturada.repeticoes.exercicio03;

import java.util.Scanner;

public class ProgramaEx03 {

	public static void main(String[] args) {
		//separar os algorismos , comparar entre os grupos
		/*Scanner sc = new Scanner(System.in);
		int x = 542;
		
		int firstTypNum;// = sc.nextInt();
		int secondTypNum;// = sc.nextInt();
		
		int a = (x%1000)/100;
		int b = (x%100)/10;
		int c = x%10;
		int z = 1;
		int d = (x%10000)/1000;
		System.out.println(a+"a-"+  b+"b- c"+ c+"- d"+d);
		
		do {
			
		}while(z != 0);*/
		int doidao = 154321;
		String bla = String.valueOf(doidao);
		String ble = "12345";
		int a = 10;
		int unidade;
		int x;
		
		if(doidao > a) {
			
			for (int i=2; i<5; i++) {
				System.out.println("valor de i="+i);
				
				x = (doidao%(a = a*10))/(a/10);
				
				System.out.println("valor de a "+a);
				
				switch (i) {
				case 1:
					System.out.println("case 1 "+ x);
					break;
				case 2:
					System.out.println("dezena "+ x);
					break;
				case 3:
					System.out.println("centena "+ x);
					break;
				case 4:
					System.out.println("unidade de milhar "+ x);
					break;
				case 5:
					System.out.println("case 5 "+ x);
					break;
				}
			
			}
		}
			unidade = doidao%10;
			System.out.println("unidade "+unidade);
		
		
		
		
		
		System.out.println(bla.equals(ble));
		System.out.println("------------------------------");
		System.out.println(bla.length());
		System.out.println(bla.contains("1"));
		System.out.println(bla.indexOf("1"));
		System.out.println(bla.lastIndexOf("1"));
		System.out.println(bla.substring(2));
		
	}

}

/* 
 3) Fazer um programa para receber dois números do tipo int do usuário e 
determinar se um número é permutação do outro ou não. Ex: 431 é permutação
de 143, 42 é permutação de 204, 1211 é permutação de 1112, etc. O programa
só deve aceitar números positivos.

*/

/*
  ex: 	1000 = 0100(1000=100)
  		1000 = 0001(1000=1)
  		
  ex:	a= 1000 	b=100
  Se 'a' possui a mesma quantidade de casas decimais;{transformar em string e usar equals tostring}
  
  Caso 'a' ou 'b' tiver 'n' casa decimais menor que outro acrescentar 0 para representar cada decimal;
  
  Pego 1 elemento B e compara se contem no A, caso nao tenha ja retorna false e finaliza
  
  Caso tenha. consuma os iguais ate que reste + nada e consequentemente sera permutacao do outro true;
  */
