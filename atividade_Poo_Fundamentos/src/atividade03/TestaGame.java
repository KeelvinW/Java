package atividade03;

public class TestaGame {

	public static void main(String[] args) {
		
		Produto p1 = new Produto ("God of War - Ragnarok", "PlayStation 5", "Batman Cavaleiro das Trevas", "Dualshock 4", "A morte do SuperMan");
		
		Produto p2 = new Produto ("Dead Space (2023)", "Xbox series X", "Funco pop Harry Potter", "PowerA", "Batman - A piada mortal");

		p1.visualizar();
		
		p2.visualizar();
		
	}

}
