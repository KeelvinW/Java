package exercicios10_02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner (System.in);
		
		int numero1, soma = 0;
		do {
			System.out.println("Digite apenas numeros inteiros: ");
			numero1 = leia.nextInt();
			if (numero1 > 0)
			soma += numero1;
			
		
		}while(numero1 != 0);
		
		System.out.println("A soma dos números positivos é: "+ soma);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
