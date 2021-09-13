package com.blog.pessoal.atividade.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="postagem")

public class Postagem {
	@Id @GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long idPostagem;
	
	private @NotBlank String titulo;
	private @NotBlank String descricao;
	private @NotBlank Date data;
	
	@ManyToOne
	@JoinColumn(name="criador_id")
	@JsonIgnoreProperties({"MinhasPostagens"})
	private Usuario criador;
	
	@ManyToOne
	@JoinColumn(name="tema_id")
	@JsonIgnoreProperties({"postagens"})
	private Tema temaRelacionado;
	
	
	public Long getIdPostagem() {
		return idPostagem;
	}
	public void setIdPostagem(Long idPostagem) {
		this.idPostagem = idPostagem;
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
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	
	
	
	
	

}
