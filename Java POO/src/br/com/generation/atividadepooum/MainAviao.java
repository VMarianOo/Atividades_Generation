package br.com.generation.atividadepooum;

import java.util.Scanner;

public class MainAviao {

	// O obejtivo desse programa � utilizar POO com class privadas e utilizar o Scanner para leitura
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aviao av = new Aviao();
		
		String a;
		
		System.out.println("Em qual comapnhia aerea voc� est� embarcando ?" );
		a = sc.next();
		
		av.setCompanhia(a);
		av.setNumCadeiras(40);
		av.setPiloto("Amilto.");
		av.setNumPassageiros(38);
		
		System.out.println("Seu piloto ser� o capit�o: " + av.getPiloto());
		System.out.println("Sua companhia aerea � a: " + av.getCompanhia());
		System.out.println("NUmero de passageira j� efetivados: " + av.getNumPassageiros());
		System.out.println("Numero toral de cadeiras no avi�o: " + av.getNumCadeiras());
		
		
		
		
		sc.close();
	}

}
