package classes;

public class EstudanteBasico extends EstudanteMestrado { // Estudante é a SUPER de Basico
	
	private int diaAniversario;

	public EstudanteBasico(int matricula, String cpf, int diaAniversario) {
		super(matricula, cpf);
		this.diaAniversario = diaAniversario;
	}
	public EstudanteBasico(int matricula, String cpf, boolean status, int diaAniversario) {
		super(matricula, cpf, status);
		this.diaAniversario = diaAniversario;
	}
	
	public int diaAniversario() {
		return diaAniversario;
	}
	public void diaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	
	public void bonusAniversario(int dia) {
		if (diaAniversario == dia) {
			super.adicionarNota((super.getPontos()*1.1));
			
			
		}
	}
	
	
	
	
	
	
	
}
