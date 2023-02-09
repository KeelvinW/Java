package exercicios09_02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int cargo;
		float salario, totsal, porcentagem;
		String nome;
		
		System.out.println("-------------REAJUSTE SALARIAL--------------");
		System.out.println("DIGITE O CÓDIGO CORRENSPONDENTE AO SEU CARGO");
		System.out.println("Codigo 1 ..........GERENTE");
		System.out.println("Codigo 2 .........VENDEDOR");
		System.out.println("Codigo 3 .......SUPERVISOR");
		System.out.println("Codigo 4 ........MOTORISTA");
		System.out.println("Codigo 5 .......ESTOQUISTA");
		System.out.println("Codigo 6 ..........TEC. TI");
		
		System.out.print("Nome do Colaborador: ");
		nome = leia.nextLine();
		
		System.out.print("Cargo do colaborador: ");
		cargo = leia.nextInt();
		
		System.out.print("Valor do salario atual: ");
		salario = leia.nextFloat();
		
		switch (cargo) {
		case 1:
			porcentagem = (salario/100)*10;
			totsal = salario + porcentagem;
			System.out.println("Colaborador: "+nome);
			System.out.println("Cargo: Gerente ");
			System.out.println("Salario Reajustado: "+totsal);
			break;
		case 2:
			porcentagem = (salario/100)*7;
			totsal = salario + porcentagem;
			System.out.println("Colaborador: "+nome);
			System.out.println("Cargo: Gerente ");
			System.out.println("Salario Reajustado: "+totsal);
			break;
		case 3:
			porcentagem = (salario/100)*9;
			totsal = salario + porcentagem;
			System.out.println("Colaborador: "+nome);
			System.out.println("Cargo: Gerente ");
			System.out.println("Salario Reajustado: "+totsal);
			break;	
		case 4:
			porcentagem = (salario/100)*6;
			totsal = salario + porcentagem;
			System.out.println("Colaborador: "+nome);
			System.out.println("Cargo: Gerente ");
			System.out.println("Salario Reajustado: "+totsal);
			break;
		case 5:
			porcentagem = (salario/100)*5;
			totsal = salario + porcentagem;
			System.out.println("Colaborador: "+nome);
			System.out.println("Cargo: Gerente ");
			System.out.println("Salario Reajustado: "+totsal);
			break;
		case 6:
			porcentagem = (salario/100)*8;
			totsal = salario + porcentagem;
			System.out.println("Colaborador: "+nome);
			System.out.println("Cargo: Gerente ");
			System.out.println("Salario Reajustado: "+totsal);
			break;
	}
}
}
