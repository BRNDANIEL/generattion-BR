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
	

	public static void main(String[] args) {
		SpringApplication.run(Turma29Application.class, args);
	}

}
