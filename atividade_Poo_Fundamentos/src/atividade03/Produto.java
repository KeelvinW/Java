package atividade03;

public class Produto {

	private String jogo;
	private String console;
	private String boneco;
	private String controle;
	private String hq;
	
	public Produto(String jogo, String console, String boneco, String controle, String hq) {
		super();
		this.jogo = jogo;
		this.console = console;
		this.boneco = boneco;
		this.controle = controle;
		this.hq = hq;
	}

	public String getJogo() {
		return jogo;
	}

	public void setJogo(String jogo) {
		this.jogo = jogo;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getBoneco() {
		return boneco;
	}

	public void setBoneco(String boneco) {
		this.boneco = boneco;
	}

	public String getControle() {
		return controle;
	}

	public void setControle(String controle) {
		this.controle = controle;
	}

	public String getHq() {
		return hq;
	}

	public void setHq(String hq) {
		this.hq = hq;
	}
	
	public void visualizar () {
		
		System.out.println("\nPRODUTOS A VENDA NA LOJA DE GAMES");
		System.out.println("Jogo lançamento: " + this.jogo);
		System.out.println("Console: " + this.console);
		System.out.println("Boneco: " + this.boneco);
		System.out.println("Acessórios para console: " + this.controle);
		System.out.println("HQ (revista em quadrinhos: " + this.hq);
		
	}
	
}
