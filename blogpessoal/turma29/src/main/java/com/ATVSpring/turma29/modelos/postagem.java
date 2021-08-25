package com.ATVSpring.turma29.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class postagem {
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long idPoatagem;
	private @NotBlank String titulo;
	private @NotBlank String descricao;
	public Long getIdPoatagem() {
		return idPoatagem;
	}
	public void setIdPoatagem(Long idPoatagem) {
		this.idPoatagem = idPoatagem;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
