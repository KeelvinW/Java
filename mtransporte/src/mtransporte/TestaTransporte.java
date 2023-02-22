package mtransporte;

public class TestaTransporte {

	public static void main(String[] args) {
		
		Transporte t1 = new Transporte(5);
		
		Transporte t2 = new Transporte();
		
		
		Terrestre tr1 = new Terrestre(5, 4, 200);
		
		
		Automovel a1 = new Automovel(5, 4, 200, "Preto", 4, "XPT-2131", 5);
		
		
		t1.visualizar();
		
		System.out.println("\n");
		
		tr1.visualizar();

		System.out.println("\n");
		
		a1.visualizar();
		
		System.out.println("\n");
		
		t2.visualizar();//passando o parametro do metodo transporte sem valor
		
		t2.setCapacidade(100);//Adicionando o valor ao metodo pela classe principal
		
		t2.visualizar();//parametro com o valor adicionado
		
		a1.mensagem();
		
		a1.mensagem("O carnaval acabou!");
		
	}

}
