package atividade01;

public class Cliente {
	
	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	private String cpf;

	
	
	public Cliente() {
		
	}


	public Cliente(String nome, String telefone, String email, String endereco, String cpf) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar () {
		
		System.out.println("Nome do Cliente: " + nome);
		System.out.println("Numero do Telefone do Cliente: " + telefone);
		System.out.println("Email do cliente : " + email);
		System.out.println("Endereço do Cliente: " + endereco);
		System.out.println("Numero do CPF: " + cpf);
		
	}
	
	
	
	
}
