package exercicios10_02;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int n1, n2;
		
		System.out.println("Digite o 1° numero: ");
		n1 = leia.nextInt();
	
		System.out.println("Digite o 2° numero: ");
		n2 = leia.nextInt();
		
		if (n1<n2) {
			for (int cont = n1; cont <= n2; cont++)
				
				if (cont % 3 == 0 && cont % 5 == 0){
					System.out.println("\n" + cont + " é multiplo de 3 e 5");
				}
					
		}else {
			System.out.println("Valor Invalido!");
		}
	
}
}
