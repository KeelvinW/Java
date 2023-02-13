package aula_04;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int vetor [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero, posicao = 0;
		boolean result = false;	
		String continua = "s";
		
	while (continua.equals("S")) {
		
		System.out.println("Digite um numero que você deseja encontrar: ");
		numero = leia.nextInt();
		
		for (int contador = 0; contador < vetor.length; contador ++) {
			if(vetor[contador] == numero) {
				posicao = contador;
				result = true;
			}
				
		}
			
		if(result == true)
			System.out.println("O número "+ numero +" está localizado na posição: "+ posicao);
		else
			System.out.println("O número "+ numero +" não foi encontrado!");
		
		System.out.println("Deseja continuar(S/N)? ");
		leia.skip("\\R?");
		continua = leia.nextLine().toUpperCase();
	}
		
		
		
		
		
		

		
		leia.close();
		
	}
}
