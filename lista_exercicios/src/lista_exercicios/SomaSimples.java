package lista_exercicios;

import java.util.Scanner;

public class SomaSimples {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int a, b, soma;
		
		System.out.println("Digite o 1° numero: ");
		a = leia.nextInt();
		
		System.out.println("Digite o 2° numero: ");
		b = leia.nextInt();
		
		soma = a + b;
		
		System.out.println("Soma = " + soma);

	}

}
