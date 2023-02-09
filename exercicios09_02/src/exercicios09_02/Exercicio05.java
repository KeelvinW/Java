package exercicios09_02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int codp, quant, total, cq, xs, xb, ba, rf, sl;
		boolean resp;
		cq = 10;
		xs = 15;
		xb = 18;
		ba = 12;
		rf = 8;
		sl = 13;
			
		System.out.println("******************_LANCHONETE DO KEL_*******************");
		System.out.println("Escolha o código do item disponível no cardápio!");
		System.out.println("1 - \tCachorro quente....R$10,00");
		System.out.println("2 - \tX-Salada...........R$15,00");
		System.out.println("3 - \tX-Bacon............R$18,00");
		System.out.println("4 - \tBauru..............R$12,00");
		System.out.println("5 - \tRefrigerante.......R$8,00");
		System.out.println("6 - \tSuco de laranja1L..R$13,00");
		System.out.print("Digite o código: ");
		codp = leia.nextInt();
		
		switch (codp) {
		
		case 1: 
			System.out.print("Digite a quantidade: ");
			quant = leia.nextInt();
			total = quant*cq;
			System.out.println("Produto: Cachorro quente");
			System.out.println("Seu pedido esta no valor de R$"+ total +". Deseja mais alguma coisa?");
			
			break;
		
		case 2:
			System.out.print("Digite a quantidade: ");
			quant = leia.nextInt();
			total = quant*xs;
			System.out.println("Produto: X-Salada");
			System.out.println("Seu pedido esta no valor de R$"+ total +". Deseja mais alguma coisa?");
			
			break;
		
		case 3:
			System.out.print("Digite a quantidade: ");
			quant = leia.nextInt();
			total = quant*xb;
			System.out.println("Produto: X-Bacon");
			System.out.println("Seu pedido esta no valor de R$"+ total +". Deseja mais alguma coisa?");
			break;
		
		case 4:
			System.out.print("Digite a quantidade: ");
			quant = leia.nextInt();
			total = quant*ba;
			System.out.println("Produto: Bauru");
			System.out.println("Seu pedido esta no valor de R$"+ total +". Deseja mais alguma coisa?");
			break;
		
		case 5:
			System.out.print("Digite a quantidade: ");
			quant = leia.nextInt();
			total = quant*rf;
			System.out.println("Produto: Refrigerante");
			System.out.println("Seu pedido esta no valor de R$"+ total +". Deseja mais alguma coisa?");
			break;
		
		case 6:
			System.out.print("Digite a quantidade: ");
			quant = leia.nextInt();
			total = quant*sl;
			System.out.println("Produto: Suco de laranja");
			System.out.println("Seu pedido esta no valor de R$"+ total +". Deseja mais alguma coisa?");
			break;
			
		
		}
	}

}
