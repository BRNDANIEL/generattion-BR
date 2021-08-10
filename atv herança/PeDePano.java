package atividades;

public class PeDePano extends animal {
	private String pureza;
	private String tipo;
	
	public PeDePano (String nome,int idade, String classe,String alimentacao,String pureza, String tipo )
	{
		super (nome,idade,classe,alimentacao);
		this.pureza=pureza;
		this.tipo=tipo;
		
	}

	public String getPureza() {
		return pureza;
	}

	public void setPureza(String pureza) {
		this.pureza = pureza;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
