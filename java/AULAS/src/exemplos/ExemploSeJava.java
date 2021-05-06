package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploSeJava {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número inteiro: ");
		numero = leia.nextInt();
		
		
		/*
		 * se o numero for 0 = zero é neutro
		 * se o numero for par escreve par
		 * se o numero for impar escreve impar
		 * se o numero for negativo escreve numero negativo
		 * 
		 * se((numero%2)==0){
		 * 	escreva ("numero par")
		 * }
		 */
		
		if(numero==0) {
			System.out.println("Zero é neutro.");
		}
		else if(numero<0) {
			System.out.println("O número é negativo");
		}
		else if((numero%2)==0) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é impar");
		}
				
				
		
		

	}

}
