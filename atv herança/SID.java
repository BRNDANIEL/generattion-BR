package atividades;

public class SID extends animal 
{
 private String nvdesono;
 private String especie;
 
 public SID (String nome,int idade, String classe,String alimentacao,String nvdesono,String especie ) {
 super (nome,idade,classe,alimentacao);
 this.nvdesono=nvdesono;
 this.especie=especie;
}

public String getNvdesono() {
	return nvdesono;
}

public void setNvdesono(String nvdesono) {
	this.nvdesono = nvdesono;
}

public String getEspecie() {
	return especie;
}

public void setEspecie(String especie) {
	this.especie = especie;
}
 
 
}
