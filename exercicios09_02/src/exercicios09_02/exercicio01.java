package exercicios09_02;				

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numa, numb, numc;
		
		System.out.println("Digite o numero A: ");
		numa = leia.nextInt();
		
		System.out.println("Digite o numero B: ");
		numb = leia.nextInt();
		
		System.out.println("Digite o numero C: ");
		numc = leia.nextInt();
		
		if (numa + numb > numc) 
			System.out.println("A soma de "+numa+" e "+numb+" é maior que "+numc);
		else if (numa + numb < numc) 
			System.out.println("A soma de "+numa+" e "+numb+" é menor que "+numc);
		else 
			System.out.println("A soma de "+numa+" e "+numb+" é igual que "+numc);
		
			
		
		
		
			
		
			
			
			
		
		
			
		
		
		
		

	}

}
