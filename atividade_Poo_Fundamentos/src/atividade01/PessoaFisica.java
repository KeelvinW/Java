package atividade01;

public class PessoaFisica extends Cliente  {
	
	private Long rg;

	public PessoaFisica(String nome, String telefone, String email, String endereco, String cpf, Long rg, int tipo) {
		super(nome, telefone, email, endereco, cpf, tipo);
		this.rg = rg;
	}

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("RG do Cliente: ");
		
	}
}
