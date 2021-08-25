package com.ATVSpring.turma29.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class tema {
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long idtema;
	private @NotBlank String tema;
	public Long getIdtema() {
		return idtema;
	}
	public void setIdtema(Long idtema) {
		this.idtema = idtema;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	
	
	
}	



