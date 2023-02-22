package Conta;

import java.util.Scanner;

import javax.swing.Spring;

public class exercicio3Resolvido {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float sb, an, he, des, sl;
		String nome;
		
		System.out.println("Difite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Funcionária(o) "+nome+", digite as informações solicitadas abaixo!");
		
		
		System.out.print("Salário Bruto: ");
		sb = leia.nextFloat();
		
		System.out.print("Adicional Noturno: ");
		an = leia.nextFloat();
		
		System.out.print("Hora Extra: ");
		he = leia.nextFloat();
		
		System.out.print("Descontos: ");
		des = leia.nextFloat();
		
		sl = (sb + an + (he*5)) - des;
	
		System.out.print(nome+"Seu salário liquido é de: "+sl);

		
		

	}

}
