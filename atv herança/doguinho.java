package atividades;

public class doguinho extends animal {
	private String fidelidade;
	private String cor;
	private String raca;
	
	public doguinho (String nome,int idade, String classe,String alimentacao, String fidelidade, String cor, String raca)
	
	{
		super (nome,idade,classe,alimentacao);
		this.fidelidade=fidelidade;
		this.cor=cor;
		this.raca=raca;
		
		
	}

	public String getFidelidade() {
		return fidelidade;
	}

	public void setFidelidade(String fidelidade) {
		this.fidelidade = fidelidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
	

}
