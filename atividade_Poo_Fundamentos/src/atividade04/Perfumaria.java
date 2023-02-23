package atividade04;

public class Perfumaria extends Farmacia {


	private String fragancia;
	

	public Perfumaria(float preco, long id, String nome, String nomeComercial, String fabricante, String foto,
			int tipo, String fragancia) {
		super(preco, id, nome, nomeComercial, fabricante, foto, tipo);
		this.fragancia = fragancia;
	}


	public String getFragancia() {
		return fragancia;
	}


	public void setFragancia(String fragancia) {
		this.fragancia = fragancia;
	}
	
	public void visualizar () {
		super.visualizar();
		System.out.println("Fragancia: + " + this.fragancia);
	}

}
