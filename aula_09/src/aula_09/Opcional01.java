package aula_09;

import java.util.Optional;

public class Opcional01 {
	
	

	public class Optional01 {

		public static void main(String[] args) {
			
	        
			String[] palavras = new String[10];
			
			for(var palavra : palavras)
				System.out.println(palavra);
			
			
			
			Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
			
			Optional<String> checaNulo2 = Optional.ofNullable(palavras[2]);
			
			if(checaNulo.isPresent()) {
				String palavra = palavras[5].toLowerCase();
				System.out.println(palavra);
			}else
				System.out.println("Não existe nenhuma palavra nesta posição!");
		}
	}
}
