/*ENQUANTO
 * 1- Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e
apresente no final o total do somat�rio ok
, a m�dia ok
e o total de valores lidos. ok
O programa
deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usu�rio fornecer um valor
negativo.
 */

package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class lista3exer1DoPortugol {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numero=1, somatorio=0, totalValoresLidos=0, qtdVezes=0;
		double media=0.00;
		
		while (numero >= 0)	{
			
			System.out.println("Informe um numero positivo: ");
			numero = leia.nextInt();
			
			somatorio = somatorio + numero;
			
			if (numero>0)
			{
				totalValoresLidos++;
			}	
			
		}
		
		media = somatorio / totalValoresLidos;
		
		System.out.printf("\nA soma dos valores informados � de: %d", somatorio);
		System.out.printf("\nA quantidade de vezes que foram informados numeros diferente de 0 foi de: %d vezes",totalValoresLidos);
		System.out.printf("\nA m�dia dos numeros informados �: %.2f ", media);
		}
}
