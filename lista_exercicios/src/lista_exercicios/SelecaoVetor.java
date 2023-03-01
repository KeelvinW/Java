package lista_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SelecaoVetor {

	public static void main(String[] args) {
		
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        double num = 0;
        
        System.out.println("Digite quantas vezes quer repetir o numero: ");
        num = leia.nextDouble();
        
        Double[] A = new Double[(int) num];

        for (int i = 0; i < A.length; i++) {
        	System.out.println("Digite os numeros que quer armazenar: ");
            double x = leia.nextDouble();
            A[i] = x;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 10) {
                System.out.println("A[" + i + "]" + " = " + A[i]);
            }
        }

	}

}
