package br.com.generation.atividadetres;

import java.util.Scanner;

public class Exercicio01 {
	
	/* A funcionalidade desse programa � um vetor por leitura com 5 valores e em seguida
	aprensentar a maior pontua��o.*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int maiorNumero = 0;
		int[] vetor = new int [5];
		
		for(int l = 0; l < vetor.length; l++) {
			System.out.printf("Digite o " + (l + 1) + "� numero: ");
			vetor[l]= sc.nextInt();
			
			if(vetor[l] > maiorNumero) {
				maiorNumero = vetor[l];
			}
		}
			System.out.println();
			System.out.println("===============================");
			System.out.println();			
			for(int l = 0; l < vetor.length; l++) {
				System.out.printf("Vetor [%d] armazenou o numero: ", (l + 1));
				System.out.printf( vetor[l] + "%n");
			}
			System.out.println();
			System.out.println("===============================");
			System.out.println();
			System.out.println("O maior numero � igual a: " + maiorNumero);
		sc.close();
	}

}
