package br.com.generation.atividadetres;

import java.util.Random;

public class Exercicio02 {
	
	/* Esse programa tem como fun��o pegar 10 valores lan�ados por um dado, ecrever esse valor e dizer a m�dia da soma dos valres e quantas
	 * vezes o maior numero que apareceu 
	 */

	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		int[] vetor = new int[10];
		int soma = 0, media, vezes = 0, maior = 0, maiorPontua = 0;
		
		for(int l = 0; l < vetor.length; l++) {
			
			vetor[l] = gerador.nextInt(1 , 6);
			System.out.println("O " + (l + 1) + "� lan�amento � igual a: " + vetor[l]);
			
			if(vetor[l] > maior) {
				maior = vetor[l];
				
			}
			
			soma = soma + vetor[l];
			vezes++;
		}
		
		for(int l = 0; l < vetor.length; l++) {
			if(maior == vetor[l]) {
				maiorPontua++;
			}
		}
		
		System.out.println("\nA m�dia de todos os lan�amentos � igual a: " + soma/vezes);
		System.out.println("O maior numero � igual a: " + maior + " e ele apareceu " + maiorPontua + " Vezes");

	}

}
