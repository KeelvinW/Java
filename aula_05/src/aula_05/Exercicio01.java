package aula_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		ArrayList <String> cores = new ArrayList<String>();
		
		int opcao = 0;
		String cor ;
		
		for(int contador = 0; contador <= 3; contador ++) {				
				System.out.println("Digite as cores que deseja salvar");
				cor = leia.nextLine();
				cores.add(cor);
		}		
					
				System.out.println("Listar de cores");	
				cores.forEach(System.out::println);
				
				Collections.sort(cores);
				System.out.println("Cores ordenadas: ");
				cores.forEach(System.out::println);
			

		
		
		
		
		
		
		
		
		

	}

}
