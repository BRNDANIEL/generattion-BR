package com.ATVSpring.turma29.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ATVSpring.turma29.repositorios.postagemrepositorio;

import antlr.collections.List;

@Controller
@RequestMapping("/api/v1/postagem")
public class postagemcontrolador {
	private @Autowired postagemrepositorio repositorio;
	@GetMapping("/todas")
	public List<postagem> pegartodos() {
		return repositorio.findAll();

}
}
