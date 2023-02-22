package atividade04;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaFarmacia {
	
	public static void main(String[] args) {
		
		ArrayList <Farmacia> medicamentos = new ArrayList <Farmacia>();
		
		Scanner leia = new Scanner (System.in);
		
		long id;
		String nome, nomeComercial, fabricante, foto, opcao;
		float preco;
		 
		
		do {
			System.out.println("\nId:  ");
			id = leia.nextLong();
			
			System.out.println("\nnome: ");
			leia.skip("\\R?");
			nome = leia.nextLine();
			
			System.out.println("\nNome Comercial: ");
			nomeComercial = leia.nextLine();
			
			System.out.println("\nFabricante: ");
			fabricante = leia.nextLine();
			
			System.out.println("\nFoto: ");
			foto = leia.nextLine();
			
			System.out.println("\nPreço: ");
			preco = leia.nextFloat();
			
			Farmacia f1 = new Farmacia (preco, id, nome, nomeComercial, fabricante, foto);
			
			medicamentos.add(f1);
			
			System.out.println("\nDeseja continuar?[S/N] ");
			leia.skip("\\R?");
			opcao = leia.nextLine();
			
		} while (opcao.equalsIgnoreCase("S"));
		
		for(var medicamento : medicamentos)
			medicamento.visualizar();
		
		//Farmacia f1 = new Farmacia (1, "Dipirona", "Novalgina", "Teuto", "-", 10.0f);
		
		
		//Farmacia f2 = new Farmacia (2, "Paracetamol", "Tylenol", "Neo Quimica", "-", 20.0f);
		
		
		//f1.visualizar();
		
		//f2.visualizar();
		
		leia.close();
	}
}
