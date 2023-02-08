package exerciciosaulajava;

import java.util.Scanner;

public class exerciciosJava {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double salario, abono, novosalario;
		
		System.out.println("Digite o salário: ");
		salario = leia.nextDouble();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextDouble();
		
		novosalario = salario + abono;
		
		System.out.println("Seu novo salário é: R$"+ novosalario);
	}	

}
