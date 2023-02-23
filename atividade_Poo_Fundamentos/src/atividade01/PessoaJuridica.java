package atividade01;

public class PessoaJuridica extends Cliente {
	
	private Long cnpj;

	public PessoaJuridica(String nome, String telefone, String email, String endereco, String cpf, Long cnpj, int tipo) {
		super(nome, telefone, email, endereco, cpf, tipo);
		this.cnpj = cnpj;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ do Cliente: " + this.cnpj);
		
		
		
	}
	
	
	
}
