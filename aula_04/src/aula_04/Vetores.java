package aula_04;

import java.util.Arrays;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int vetorInteiros[] = {1,2,3,4,5};
		
		float vetorFloat[] = new float [5];
		
		
		for(int contador=0; contador < vetorInteiros.length; contador ++)
			System.out.println("Posição " + contador + " = " + vetorInteiros[contador]);
		
		// O contador indica a posição dos vetores. 
		
		
		for(int indice = 0; indice < vetorFloat.length; indice ++ ) {
			System.out.println("Digite um valor para a posição [" + indice + "]");
			vetorFloat[indice] = leia.nextFloat();	
		}
		
		//Arreys.sort serve para ordenar numeros aleatorios nos vetores automaticamente.
		Arrays.sort(vetorFloat);
		
		// Essa é a forma de simplificar a variavel For, só é possível utilizar para listar e imprimir vetores.
		for(float numero : vetorFloat)
			System.out.println(numero);
		
		
			
			
			
		leia.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
