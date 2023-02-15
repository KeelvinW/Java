package aula_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Set <Integer> num = new HashSet <Integer>();
		
		int valor = 0;
		
		System.out.println("Digite 10 valores inteiros: ");
		
		
		for(int contador = 0; contador < 10; contador ++) {
			valor = leia.nextInt();
			
			num.add(valor);
		}
			
			Iterator<Integer> iNum = num.iterator();
			
			System.out.println("Lista de dados no set: ");
			while(iNum.hasNext()) {
				
				System.out.println(iNum.next());
			}
			
	}

}
