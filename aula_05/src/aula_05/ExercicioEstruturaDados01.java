package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioEstruturaDados01 {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		Scanner leia = new Scanner(System.in);

		int opcao = 0;
		String resp;

		do {
			System.out.println("****************************************");
			System.out.println("\n1- Adicionar Cliente na fila");
			System.out.println("\n2- Listar de todos os Clientes");
			System.out.println("\n3- Retirar Cliente da Fila");
			System.out.println("\n0- Sair");
			System.out.println("\n****************************************");
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome:");
				leia.skip("\\R?");
				resp = leia.nextLine();
				fila.add(resp);
				System.out.println("Cliente Adicionado!");
				break;
				
			case 2:
				System.out.println("Lista de todos os Clientes");
				fila.forEach(System.out::println);
				break;
			
			case 3:
				
				System.out.println("Retirar o primeiro Cliente da Fila");
				System.out.println("O Cliente "+fila.poll()+ " foi retirado!");
				break;
		
			
			}

		
		} while (opcao != 0);
			System.out.println("Programa Finalizado! ");

	
	
	}

}
