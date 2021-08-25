package com.ATVSpring.turma29.modelos;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity 
public class usuario {
private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long idusuario;
private String nome;
private @NotBlank @Email String email;
private @NotBlank String senha;
public Long getIdusuario() {
	return idusuario;
}
public void setIdusuario(Long idusuario) {
	this.idusuario = idusuario;
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



}
