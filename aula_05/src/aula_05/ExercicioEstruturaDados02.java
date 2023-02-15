package aula_05;


import java.util.Scanner;
import java.util.Stack;

public class ExercicioEstruturaDados02 {

	public static void main(String[] args) {
		Stack<String> livro = new Stack<String>();

		Scanner leia = new Scanner(System.in);

		int opcao = 0;
		String resp;

		do {
			System.out.println("****************************************");
			System.out.println("\n1- Adicionar livro na pilha");
			System.out.println("\n2- Listar todos os livros");
			System.out.println("\n3- Retirar livro da pilha");
			System.out.println("\n0- Sair");
			System.out.println("\n****************************************");
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o livro que deseja adicionar: ");
				leia.skip("\\R?");
				resp = leia.nextLine();
				livro.add(resp);
				System.out.println("livro Adicionado!");
				break;
				
			case 2:
				System.out.println("Lista de livros na pilha ");
				livro.forEach(System.out::println);
				
				break;
			
			case 3:
				livro.pop();
				System.out.println("Pilha: ");
				System.out.println("O livro "+livro.peek()+ " foi retirado!");
				break;
		
			
			}

		
		} while (opcao != 0);
			System.out.println("Programa finalizado!");


	}

}
