package br.com.generation.exerciciodois;

public class MainCliente {
	
	//A fun��o desse programa � trabalhar com a POO com uma calss publica 

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.nome = "Gabriel";
		cliente.corDaPele = "Pardo";
		cliente.idade = 22;
		
		System.out.println(cliente.nome);
		System.out.println(cliente.corDaPele);
		System.out.println(cliente.idade);
	}

}
