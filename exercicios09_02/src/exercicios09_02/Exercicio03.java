package exercicios09_02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade;
		String nome;
		boolean resposta;
		
		System.out.println("******** AVALIAÇÃO PARA DOAÇÃO DE SANGUE *********");
		System.out.print("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.print("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.print("Primeira doação de sangue?: ");
		resposta = leia.hasNextBoolean();
		
		if(idade>=60 && idade<=69) {
			if(resposta)
				System.out.println("Não esta apto para doar!");
			else	
				System.out.println("Esta apto para doar !");
		}else if (idade < 18 || idade > 69)
			System.out.println("Não esta apto para doar!");
		else  
			System.out.println("Esta apto para doar !");
			
		}
		
		
	}


