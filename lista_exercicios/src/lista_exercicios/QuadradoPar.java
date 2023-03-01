package lista_exercicios;

import java.util.Scanner;

public class QuadradoPar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero;
		int par = 0;
		
		System.out.println("Digite um numero inteiro: ");
		numero = leia.nextInt();
		
		for (int contador = 1; contador <= numero; contador ++) {
			if (contador % 2 == 0) {
				par = contador * contador;
				System.out.println(contador + " ^ 2 = " + par);
			}
		}
	}

}
