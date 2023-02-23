package atividade04;

public class Medicamento extends Farmacia {

	private String principioAtivo;

	public Medicamento(float preco, long id, String nome, String nomeComercial, String fabricante, String foto, int tipo, String principioAtivo) {
		super(preco, id, nome, nomeComercial, fabricante, foto, tipo);
		this.principioAtivo = principioAtivo;
	}

	public String getPrincipioAtivo() {
		return principioAtivo;
	}

	public void setPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}
	
	public void visualizar () {
		super.visualizar();
		System.out.println("Principio ativo: + " + this.principioAtivo);
	}
	
}
