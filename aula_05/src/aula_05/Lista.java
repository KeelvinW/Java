package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		ArrayList <Double> notas = new ArrayList<Double>();
		
		int opcao = 0;
		double nota = 0.0;
		
		do {
			System.out.println("1- Cadastrar nota");
			System.out.println("2- Listar todas as notas");
			System.out.println("3- Procurar uma nota");
			System.out.println("4- Remover uma nota");
			System.out.println("5- Atualizar nota");
			System.out.println("6- Sair");
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();

			
			if(opcao > 6 && opcao < 0)
				System.out.println("Opção Inválida!");
			else
			switch(opcao) { 
				
				
				
				case 1:
					System.out.println("Digite uma nota entre 1 e 10");
					nota = leia.nextDouble();
					notas.add(nota);
					break;
				
				case 2:
					System.out.println("Listar todas as notas");
					/*for(var listaNota : notas)
						System.out.println(listaNota);*/
					
					if(notas.isEmpty())
						System.out.println("Base de dados vazia!");
					else
						notas.forEach(System.out::println);
					
					break;
				
				case 3:
					System.out.println("Procurar uma nota");
					System.out.println("Digite a nota: ");
					nota = leia.nextDouble();
					System.out.println("A nota "+ nota +" existe? "+ notas.contains(nota));
					System.out.println("O índice de minha nota é: "+ notas.indexOf(nota));
					break;
				case 4:
					System.out.println("Remover uma nota");
					System.out.println("Digite a nota: ");
					nota = leia.nextDouble();
					notas.remove(nota); //Nota
					//notas.remove(notas.indexOf(nota));//Indice da nota
					break;
				case 5:
					System.out.println("Atuaizar uma nota");
					System.out.println("Digite a nota atual: ");
					nota = leia.nextDouble();
					System.out.println("Digite a nova nota: ");
					double notaNova = leia.nextDouble();
					notas.set(notas.indexOf(notas), notaNova);
				default:
					if(opcao > 6 && opcao < 0)
						System.out.println("Opção Inválida!");
			}
			
			
			
			
			
		} while(opcao!=6);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
