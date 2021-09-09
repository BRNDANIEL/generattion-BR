package com.blog.pessoal.atividade.Controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.pessoal.atividade.Model.Postagem;

import com.blog.pessoal.atividade.Repository.PostagemRepository;


@RestController
@RequestMapping
@CrossOrigin
public class PostagemController {

	@RestController
	@RequestMapping ("/postagem")

	public class postagemController {
		private @Autowired PostagemRepository repository;
		
		@GetMapping("/todos1")
		public ResponseEntity<Postagem> novaPostagem( Postagem novaPostagem){
			return ResponseEntity.status(201).body(repository.save(novaPostagem));}
		
		@PostMapping("/criarPostagem")
		public ResponseEntity<Postagem> criarPostagem(@Valid @RequestBody Postagem novaPostagem){
			return ResponseEntity.status(201).body(repository.save(novaPostagem));
		}
		
		@PutMapping("/atualizarTema")
		public ResponseEntity<Postagem> atualizarPostagem (Postagem PostagemParaAtualizar){
			return ResponseEntity.status(201).body(repository.save(PostagemParaAtualizar));}
		

		@DeleteMapping("/deletar/{id_Postagem}")
		public void deletarPostagem(@PathVariable(value="id_Postagem")Long idPostagem) {
			repository.deleteById(idPostagem);
		}
		
		
		@GetMapping("/{id_Postagem}")
		public ResponseEntity<Postagem>buscarPorid(@PathVariable(value = "id_Postagem")Long idDaPostagem)
		{
			Optional<Postagem> objetoPostagem=repository.findById(idDaPostagem);
			if (objetoPostagem.isPresent()) {
				return ResponseEntity.status(200).body(objetoPostagem.get());
				}
			else { 
				return ResponseEntity.status(204).build();
			}
		}
			
		
	}
	}
		


