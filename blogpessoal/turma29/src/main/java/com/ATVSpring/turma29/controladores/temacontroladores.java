package com.ATVSpring.turma29.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ATVSpring.turma29.repositorios.temarepositorio;

import antlr.collections.List;

@Controller
@RequestMapping("/api/v1/tema")
public class temacontroladores {
	private @Autowired temarepositorio repositorio;
	@GetMapping("/todos")
	public List<tema> pegartodos() {
		return repositorio.findAll();

}
