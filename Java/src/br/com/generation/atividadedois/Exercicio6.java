package br.com.generation.atividadedois;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0, soma = 0, i = 0;
		
		do {
			 System.out.println("Digite um numero qualquer ou zero para sair: ");
			 a = sc.nextInt();
			 
			 if(a % 3== 0) {
			 soma += a;
			 i++;
			            }
		}while(a != 0);
		
		i--;
		System.out.println("A m�dia dos numeros que voc� escolheu que s�o multiplos de 3 �: " + soma / i);
		
		sc.close();

	}

}
