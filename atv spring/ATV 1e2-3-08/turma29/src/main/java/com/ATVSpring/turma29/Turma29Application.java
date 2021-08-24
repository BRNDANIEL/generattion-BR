package com.ATVSpring.turma29;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")



public class Turma29Application {
	@GetMapping("/r1")
	
	public String oi() {
	return "ola povo bonito, bem vindos ao meu primeiro ola mundo em stringboot";
	}
	@GetMapping("/r2")
	public String oi2() {
		return "ola nessa atividade tive que utilizar muita persistencia pois não compreendi a materia direto e minha internet ruim me impossibilitou de tirar duvidas. \n pretendo aprender mais sobre spring essa semana e conseguir implementar o aprendizado no meu projeto ";
		}

	public static void main(String[] args) {
		SpringApplication.run(Turma29Application.class, args);
	}

}
