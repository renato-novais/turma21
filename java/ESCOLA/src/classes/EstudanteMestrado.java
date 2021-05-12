package classes;

public class EstudanteMestrado extends ProjetoEscola {
	
	//atributos
	private int matricula;
	private String cpf;
	private double pontos;
	private boolean status;
	private String nome;
	private double creditoMestrado;
	private double creditoMestradoUsado;
	private boolean usarCreditoMestrado;
	private int movimentos;
	
	//construtores
	public EstudanteMestrado(int matricula, String cpf, double pontos, boolean status) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.pontos = pontos;
		this.status = status;
	}
	
	//encapsulamento - getters and setters //get-pegar informação  set-mudar informação
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getPontos() {
		return pontos;
	}
	public void setPontos(double pontos) {
		this.pontos = pontos;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//metodos
	public void adicionarNota(double pontos) {
		this.pontos = this.pontos + pontos;
	}
	public void tirarNota(double pontos) {
		this.pontos = this.pontos - pontos;
	}
	public void creditoMestrado(double pontos) {
		while(creditoMestrado<=10) {
			if (usarCreditoMestrado == true) {
				this.pontos = this.pontos + this.creditoMestradoUsado;
				this.creditoMestrado = this.creditoMestrado - this.creditoMestradoUsado;
			}
		
		}
	}
	
//usarCreditoMestrado
//Solicitar a qualquer tempo ou após os 10 movimentos o uso do crédito (limitado a 10 pontos) levando o valor para a nota.
}
