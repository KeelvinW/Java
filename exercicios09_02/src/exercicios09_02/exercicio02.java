package exercicios09_02;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int num;
		
		System.out.println("Digite o numero: ");
		num = leia.nextInt();
		
		if(num % 2 == 0 && num > 0)
			System.out.println("O número "+num+" é par e positivo!");
		else
			System.out.println("O número "+num+" é ímpar e negativo!");
			
		

	}

}
