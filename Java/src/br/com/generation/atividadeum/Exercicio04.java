package br.com.generation.atividadeum;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double numero, mod, raiz, elevado;

		System.out.println("Digite seu numero: ");
		numero = sc.nextInt();
		
		mod = numero % 2;
		
		if(mod == 0) {
			raiz = Math.sqrt(numero);
			System.out.printf("Seu numero � par, a raiz quadrada dele �: %.2f%n", raiz);
		} else if(mod != 0) {
			elevado = Math.pow(numero,2);
			System.out.println("Seu numero � impar, elevado ao quadrado fica: " + elevado);
			
		}
		
	}

}
