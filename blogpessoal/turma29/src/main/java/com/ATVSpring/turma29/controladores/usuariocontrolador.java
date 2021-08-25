package com.ATVSpring.turma29.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ATVSpring.turma29.repositorios.usuariorepositorio;

import antlr.collections.List;

@Controller
@RequestMapping("/api/v1/usuario")
public class usuariocontrolador { 
	private @Autowired usuariorepositorio repositorio;
	@GetMapping("/todes")
	public List<usuario> pegartodos() {
		return repositorio.findAll();
	}
}
