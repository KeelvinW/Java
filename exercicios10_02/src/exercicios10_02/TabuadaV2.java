package exercicios10_02;

import java.util.Scanner;

public class TabuadaV2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero;
		boolean ok = false;
		String continua;
		
		do {	
			do {
					System.out.println("Digite a taboada que você deseja calcular: ");
					numero = leia.nextInt();
				
				if (numero <= 1 || numero > 10)
					System.out.println("Digite um numero entre 1 a 10!");
				else
					ok = true;
			
			}while (ok == false);
				//UTILIZANDO "WHILE" AO INVEZ DE "FOR" PARA FAZER A REPETIÇÃO
				int contador = 1;
				while( contador <= 10) {
					System.out.println("\n" + numero +" X " + contador + " = " + (numero * contador));
					contador ++;
				//UTILIZANDO "WHILE" AO INVEZ DE "FOR" PARA FAZER A REPETIÇÃO
				}
				
				ok = false;
				
				System.out.println("Deseja continuar(S/N)?");
				leia.skip("\\R?");
				continua = leia.nextLine();
		
		}while(continua.equalsIgnoreCase("S"));	
			leia.close();

	}

}
