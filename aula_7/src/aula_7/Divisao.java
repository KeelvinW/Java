package aula_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) throws MinhaExcecao {
		
		Scanner leia = new Scanner (System.in);
		
		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;
		
		do {
			
			try {
				System.out.println("Digite o Dividendo: ");
				dividendo = leia.nextInt();
				
				System.out.println("Digite o Divisor: ");
				divisor = leia.nextInt();
				
				divide(dividendo, divisor);
			
			}catch(InputMismatchException e) {
				System.err.println("Exceção : " + e);
				leia.nextLine();
				System.out.println("Digite somente números!");
			}catch(ArithmeticException e) {
				System.err.println("Exceção : " + e);
				leia.nextLine();
				System.out.println("Digite um numero diferente de zero!");	
			}finally {
				System.out.println("Sempre serei executado!");
			}
		
		}while(loop);
		
	}
	
	public static void divide (int dividendo, int divisor) throws MinhaExcecao {
		System.out.println("Divisão = " + (dividendo / divisor));
		
		if ((dividendo / divisor) > 5)
			throw new ArithmeticException("A divisão é maior do que 5!");
			
	}		
	
}
