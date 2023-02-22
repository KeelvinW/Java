package atividade02;

public class Testa_Funcionario {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario ("454670", "Kelvin Wesley de Souza da Silva", "xxx.xxx.xxx.xx", "Ensino médio completo", "Estoquista");
		
		Funcionario func2 = new Funcionario ("478904", "Ricardo Maeda", "123.456.789-00", "Ensino superior cursando", "Administrativa");
		
		func1.visualizar();
		
		func2.visualizar();
		
	}
	
}
