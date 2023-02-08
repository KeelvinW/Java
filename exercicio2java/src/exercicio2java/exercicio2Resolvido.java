package exercicio2java;

import java.util.Scanner;

public class exercicio2Resolvido {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		String nome;
		
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Olá "+ nome+", digite sua nota abaixo!");
		
		System.out.println("nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.println("nota 4: ");
		nota4 = leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
			
		
		System.out.println(nome+", sua média de notas é igual a: "+media);

		
		
		
		
		
		
		

	}

}
