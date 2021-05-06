package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploBoolean {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		String nome;
		char tipo;
		double salario;
		boolean emergencial; //true or false
		char aux;
		
		System.out.println("Digite o nome:");
		nome = leia.next();
		System.out.println("M-masculino/F-feminino/O-outre)");
		tipo = leia.next().charAt(0);
		System.out.println("Digite o salaário mensal bruto:");
		salario = leia.nextDouble();
		System.out.println("VocÊ pegou o sálario emergencial? S-sim/N-não");
		aux = leia.next().toUpperCase().charAt(0);
				
				if(aux=='S') {
					emergencial = true;
				}
				else {
					emergencial = false;
				}
	
				if((salario*12)>6000) {
					if(salario>=5000 && salario<6000) {
						imposto=(salario*12)*0.15;
						if(emergencial) {
							imposto += 3000;//tira onda    //imposto = imposto +3000		
						}
				}
					
					else(emergencial) {
						
					}
				}
	}

}
