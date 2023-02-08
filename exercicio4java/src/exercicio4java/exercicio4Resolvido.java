package exercicio4java;

import java.util.Scanner;

public class exercicio4Resolvido {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, dif;
		
		System.out.print("Digite o 1° valor: ");
		n1 = leia.nextFloat();
		
		System.out.print("Digite o 2° valor: ");
		n2 = leia.nextFloat();
		
		System.out.print("Digite o 3° valor: ");
		n3 = leia.nextFloat();
		
		System.out.print("Digite o 4° valor: ");
		n4 = leia.nextFloat();
		
		dif = (n1 * n2)-(n3 * n4);
		
		System.out.println("O calculo da diferença do produto é igual a "+dif);
	
		
		

	}

}
