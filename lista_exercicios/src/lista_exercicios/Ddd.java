package lista_exercicios;

import java.util.Scanner;

public class Ddd {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int ddd;
		
		/*System.out.println("---------------------------------");
		System.out.println("   DDD   |       Destinatário    ");
		System.out.println("---------------------------------");
		System.out.println("    61   |       Braília         ");
		System.out.println("    71   |       Salvador        ");
		System.out.println("    11   |       São Paulo       ");
		System.out.println("    21   |       Rio de Janeiro  ");
		System.out.println("    32   |       Juiz de Fora    ");
		System.out.println("    19   |       Campinas        ");
		System.out.println("    27   |       Vitória         ");
		System.out.println("    31   |       Belo Horizonte  ");
		System.out.println("---------------------------------");*/
		System.out.println("Digite o DDD da sua região: ");
		
		ddd = leia.nextInt();
		
		if (ddd == 61)
			System.out.println("Brasília");
		else if (ddd == 71)
			System.out.println("Salvador");
		else if (ddd == 11)
			System.out.println("São Paulo");
		else if (ddd == 21)
			System.out.println("Rio de Janeiro");
		else if (ddd == 32)
			System.out.println("Juiz de Fora");
		else if (ddd == 19)
			System.out.println("Campinas");
		else if (ddd == 27)
			System.out.println("Vitória");
		else if (ddd == 31)
			System.out.println("Belo Horizonte");
		else
			System.out.println("DDD não cadastrado!");
			

	}

}
