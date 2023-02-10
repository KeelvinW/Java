package exercicios10_02;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade, sexo, categoria, backend = 0, frontend = 0, mobile = 0, full = 0;
		String continua = "s";
			
		while(continua.equals("S")) {
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
			System.out.println("Digite o sexo: ");
			sexo = leia.nextInt();
			
			System.out.println("Digite a categoria: ");
			categoria = leia.nextInt();
			
			if(categoria == 1)
				backend ++;
			
			if(categoria == 2 && sexo == 2)
				frontend ++;
			
			if(categoria == 3 && sexo == 1 && idade > 40)
				mobile ++;
			
			if(categoria == 4 && sexo == 2 && idade < 30)
				full ++;
			
			System.out.println("Deseja continuar(S/N)? ");
			leia.skip("\\R?");
			continua = leia.nextLine().toUpperCase();
			
		}
		System.out.println("Totol de pessoas desenvolvedoras Backend: "+ backend);
		System.out.println("Totol de mulheres desenvolvedoras frontend: "+ frontend);
		System.out.println("Totol de homens desenvolvedoras mobile: "+ mobile);
		System.out.println("Totol de mulheres desenvolvedoras fullstack: "+ full);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
