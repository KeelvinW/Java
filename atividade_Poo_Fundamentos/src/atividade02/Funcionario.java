package atividade02;

public class Funcionario {

	private String identificao;
	private String nome;
	private String cpf;
	private String escolaridade;
	private String cargo;
	
	
	public Funcionario(String identificao, String nome, String cpf, String escolaridade, String cargo) {
		super();
		this.identificao = identificao;
		this.nome = nome;
		this.cpf = cpf;
		this.escolaridade = escolaridade;
		this.cargo = cargo;
	}


	public String getIdentificao() {
		return identificao;
	}


	public void setIdentificao(String identificao) {
		this.identificao = identificao;
	}


	public String getnome() {
		return nome;
	}


	public void setnome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEscolaridade() {
		return escolaridade;
	}


	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	

	public void visualizar () {
		
		System.out.println("Matricula do Funcionario: " + this.identificao);
		System.out.println("Nome do Funcionario: " + this.nome);
		System.out.println("CPF do Funcionario" + this.cpf);
		System.out.println("Escolaridade do Funcionario: " + this.escolaridade);
		System.out.println("Cargo do Funcionario: " + this.cargo);
		
	}

}
