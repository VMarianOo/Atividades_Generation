package br.com.generation.atividadedois;

import java.util.Scanner;

public class Exercicio2 {
	
	// A funcionalidade desse programa � ler 10 numeros inteiros e dizer quantos deles s�o pares e quantos deles s�o impares

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int par = 0, impar = 0;
		
		for(int i = 1; i <= 10; i++){
		
			System.out.println("Digite o " + (i) + "� numero desejado: ");
			int numero = sc.nextInt();
			
			numero = numero % 2;
			
			if(numero == 0) {
				par++;
			}
			else {
				impar++;
			}
			
		}
		
		System.out.println("Sua quantidade de numero par �: " + par);
		
		System.out.println("Sua quantidade de numero impar �: " + impar);
		
		sc.close();
			

	}

}
