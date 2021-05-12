package programas;

import java.util.Scanner;


import classes.Basico;

import classes.Estudante;

public class ProgramaTeste {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nome = leia.next();
		System.out.println("Digite o número da matricula:");
		int matricula = leia.nextInt();
		System.out.println("Digite o cpf");
		int cpf = leia.nextInt();
		System.out.println("Digite o dia de aniversário");
		int diaAniversario = leia.nextInt();
		System.out.println("Digite a nota inicial: ");
		double nota = leia.nextDouble();
		
		Basico aluno1 = new Basico(matricula,cpf,dia); // instanciando o objeto
		
		aluno1.setNome(nome);
		aluno1.adicionarNota(nota);
		System.out.printf("PONTOS ATUAIS do aluno %s = %.0f\n",aluno1.getNome(),aluno1.getPontos());
		System.out.println("Digite o dia atual: ");
		int diaAtual = leia.nextInt();
		aluno1.bonusAniversario(diaAtual);
		System.out.printf("PONTOS PÓS MÉTODO do aluno %s = %.0f\n",aluno1.getNome(),aluno1.getPontos());
		
		
			
	}	
}
