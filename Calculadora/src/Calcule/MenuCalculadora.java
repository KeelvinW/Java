package Calcule;
import java.util.Scanner;

public class MenuCalculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Calculos calc = new Calculos();
		
		double numero1, numero2 ;
		int opcao;
		
		while (true) {
			
			System.out.println("1- Soma");
			System.out.println("2- subtração");
			System.out.println("3- Multiplicação");
			System.out.println("4- Divisão");
			
			System.out.println("Digite o número da operação: ");
			opcao = leia.nextInt();
			
			if(opcao == 0) {
				leia.close();
				System.exit(0);
			}
			
			
			System.out.println("Digite o primeiro numero: ");
			numero1 = leia.nextDouble();
			
			System.out.println("Digite o segundo número: ");
			numero2 = leia.nextDouble();
			
			
			
			switch(opcao) {
			case 1 -> System.out.println("Soma: " + calc.soma(numero1, numero2));
			case 2 -> System.out.println("subtração: " + calc.subtracao(numero1, numero2));
			case 3 -> System.out.println("Multiplicação: " + calc.multiplicacao(numero1, numero2));
			case 4 -> System.out.println("Divisão: " + calc.divisao(numero1, numero2));
			default -> System.out.println("Opção Invalida!");
			}
			 
			
			
			
			
			
		}
	}

}
