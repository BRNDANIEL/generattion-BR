package atividades;
//atributos
public class animal {
	private String nome;
	private int idade; 
	private String classe; 
	private String alimentacao; 
	
	//construtor
	public animal (String nome,int idade, String classe,String alimentacao )
	{
		super ();
		this.nome=nome;
		this.idade=idade;
		this.classe=classe;
		this.alimentacao=alimentacao;
		
		//get´s e set´s
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	
	
				
		
	
	
	

}
