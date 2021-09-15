package com.blog.pessoal.atividade.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.Email;
@Entity
@Table(name="usuario")
public class Usuario {
	
	private @Id @GeneratedValue(strategy =GenerationType.IDENTITY ) Long idUsuario;
	private @NotBlank String nome;
	private @NotBlank @Email  String email;
	private @NotBlank @Size(min=8) String senha;
	
	@OneToMany(mappedBy = "criador", cascade =CascadeType.REMOVE)
	@JsonIgnoreProperties({"criador"})
	private List<Postagem> MinhasPostagens = new ArrayList<>();
	
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setToken(String autorizacaoHeader) {
		// TODO Auto-generated method stub
		
	}
	public void setId(Long idUsuario2) {
		// TODO Auto-generated method stub
		
	}
	public List<Postagem> getMinhasPostagens() {
		return MinhasPostagens;
	}
	public void setMinhasPostagens(List<Postagem> minhasPostagens) {
		MinhasPostagens = minhasPostagens;
	}
	
	
	
}
