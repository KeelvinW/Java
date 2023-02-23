package atividade01;

import java.util.ArrayList;
import java.util.Scanner;

import atividade04.Farmacia;
import atividade04.Medicamento;

public class Testa_Cliente {

	public static void main(String[] args) {
		
		ArrayList <Cliente> clientes = new ArrayList <Cliente>();
		
		Scanner leia = new Scanner (System.in);
		
		String nome = "", telefone = "", email = "", endereco = "", cpf = "", opcao = "";
		int tipo = 0;
		Long cnpj, rg;
		
		
		do {
				System.out.println("Nome do Cliente: " + nome);
				leia.skip("\\R?");
				nome = leia.nextLine();
				
				System.out.println("Numero do Telefone do Cliente: " + telefone);
				leia.skip("\\R?");
				telefone = leia.nextLine();
						
				System.out.println("Email do cliente : " + email);
				leia.skip("\\R?");
				email = leia.nextLine();
						
				System.out.println("Endereço do Cliente: " + endereco);
				leia.skip("\\R?");
				endereco = leia.nextLine();
						
				System.out.println("Numero do CPF: " + cpf);
				leia.skip("\\R?");
				cpf = leia.nextLine();
				
				System.out.println("Digite '1' para pessoa juridica | Digite '2' para pessoa física: " + tipo);
				tipo = leia.nextInt();
			
				switch (tipo) {
						case 1 -> {
							System.out.println("\nDigite o CNPJ: ");
							cnpj = leia.nextLong();
							PessoaJuridica pj = new PessoaJuridica (nome, telefone, email, endereco, cpf, cnpj, tipo);
							clientes.add(pj);
							
						}
						case 2 -> {
							System.out.println("\nDigite o CPF: ");
							rg = leia.nextLong();
							PessoaFisica pf = new PessoaFisica (nome, telefone, email, endereco, cpf, rg, tipo);
							clientes.add(pf);
						}
						
				}
			
				System.out.println("\nDeseja continuar?[S/N] ");
				leia.skip("\\R?");
				opcao = leia.nextLine();
			
		} while (opcao.equalsIgnoreCase("S"));
		
		for(var cliente : clientes)
			cliente.visualizar();
		
	}

}
