package aula_04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int matrizInteiros[][] = new int [3][3];  //{{1,2,3}, {4,5,6}, {7,8,9}};
		int soma1 = 0, soma2 = 0;
		
		Scanner leia = new Scanner (System.in);
		
		for (int linha = 0; linha < matrizInteiros.length; linha ++) {
			for (int coluna = 0; coluna < matrizInteiros.length; coluna ++) {
				System.out.println("Digite um numero para posição [" + linha + "][" + coluna + "]:");
				matrizInteiros[linha][coluna] = leia.nextInt();
			}
			
		}
		
		for (int linha = 0; linha <  matrizInteiros.length; linha++) {
			 System.out.println("Diagonal principal: "+ matrizInteiros[linha][linha]);
             soma1 += matrizInteiros[linha][linha];	
		}
       
		System.out.println("Soma dos elementos da Diagonal Principal: " + soma1);
		
		for (int linha = 0; linha <  matrizInteiros.length; linha++) {
			 System.out.println("Diagonal secundária: "+ matrizInteiros[linha][matrizInteiros.length - 1 - linha]);
			 soma2 += matrizInteiros[linha][matrizInteiros.length - 1 - linha];	
		}
		
		System.out.println("soma dos elementos da Diagonal Secundária: " + soma2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
