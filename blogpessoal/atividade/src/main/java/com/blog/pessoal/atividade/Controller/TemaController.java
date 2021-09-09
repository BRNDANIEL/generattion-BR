package com.blog.pessoal.atividade.Controller;


import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.pessoal.atividade.Model.Tema;
import com.blog.pessoal.atividade.Repository.TemaRepository;



@RestController
@RequestMapping ("/tema")

public class TemaController {
	private @Autowired TemaRepository repository;
	
	@GetMapping("/tudos")
	public ResponseEntity<Tema> novoTema(Tema novoTema){
		return ResponseEntity.status(201).body(repository.save(novoTema));}
	
	@PostMapping("/criarTema")
	public ResponseEntity<Tema> criarTema(@Valid @RequestBody Tema novoTema){
		return ResponseEntity.status(201).body(repository.save(novoTema));
	}
	
	@PutMapping("/atualizarTema")
	public ResponseEntity<Tema> atualizarUsuario (Tema TemaParaAtualizar){
		return ResponseEntity.status(201).body(repository.save(TemaParaAtualizar));}
	

	@DeleteMapping("/deletar/{id_tema}")
	public void deletarTema(@PathVariable(value="id_Tema")Long idTema) {
		repository.deleteById(idTema);
	}
	
	
	@GetMapping("/{id_Tema}")
	public ResponseEntity<Tema>buscarPorid(@PathVariable(value = "id_tema")Long idDoTema)
	{
		Optional<Tema> objetoTema=repository.findById(idDoTema);
		if (objetoTema.isPresent()) {
			return ResponseEntity.status(200).body(objetoTema.get());
			}
		else { 
			return ResponseEntity.status(204).build();
		}
	}
		
	
}
	


