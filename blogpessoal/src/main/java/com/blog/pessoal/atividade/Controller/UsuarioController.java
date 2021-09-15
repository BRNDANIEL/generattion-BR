package com.blog.pessoal.atividade.Controller;

import java.util.List;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blog.pessoal.atividade.Model.Usuario;
import com.blog.pessoal.atividade.Repository.UsuarioRepository;
import com.blog.pessoal.atividade.Service.UsuarioService;
import com.blog.pessoal.atividade.Utilities.UsuarioLogin;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	private @Autowired UsuarioService servicos;
	private @Autowired UsuarioRepository repository;
	
	//@GetMapping("/tudo")
	//public ResponseEntity<List<Usuario>> pegarTudo(){
	//	List<Usuario> objetolista=repository.findAll();
	//	if(objetolista.isEmpty()) {
			//return ResponseEntity.status(204).build();
		//}	
				//return ResponseEntity.status(200).body(objetolista);
				//metodo maior 
		
	//}
	@GetMapping("/tudo")
	public ResponseEntity<Usuario> cadastrarUsuario(Usuario novoUsuario){
		return ResponseEntity.status(201).body(repository.save(novoUsuario));}
	
	@PostMapping("/criarusuario")
	public ResponseEntity<Usuario> criarUsuario	(@Valid @RequestBody Usuario novoUsuario){
		return ResponseEntity.status(201).body(repository.save(novoUsuario));
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<Usuario> atualizarUsuario (Usuario UsuarioParaAtualizar){
		return ResponseEntity.status(201).body(repository.save(UsuarioParaAtualizar));}
	
	@DeleteMapping("/deletar/{id_usuario}")
	public void deletarUsuario(@PathVariable(value="id_usuario")Long idUsuario) {
		repository.deleteById(idUsuario);
		}
	
	@GetMapping("/{id_usuario}")
	public ResponseEntity<Usuario> buscarPorid(@PathVariable(value = "id_usuario")Long idDoUsuario)
	{
		Optional<Usuario> objetoUsuario=repository.findById(idDoUsuario);
		if (objetoUsuario.isPresent()) {
			return ResponseEntity.status(200).body(objetoUsuario.get());
			}
		else { 
			return ResponseEntity.status(204).build();
		
	}
	}
	@GetMapping("/nome{nome_usuario}")
	public ResponseEntity<List<Usuario>> buscarPorNome (@PathVariable(value="nome_usuario")String nome ){
		List<Usuario> objetoNomes= repository.findAllByNomeContainingIgnoreCase (nome);
		if (objetoNomes.isEmpty()) {
			return ResponseEntity.status(204).build();
			}
		else { 
			return ResponseEntity.status(200).body(objetoNomes);}
		
	}
	
	@GetMapping("/email{email}")
	public ResponseEntity<Usuario> buscarPorEmail (@RequestParam(defaultValue ="") String email ){
		return repository.findByEmail(email)
				.map(emailencontrado -> ResponseEntity.ok(emailencontrado))
		.orElse(ResponseEntity.notFound().build());
	}
	@PutMapping("/credenciais")
    public ResponseEntity<Object> credenciais(@Valid @RequestBody UsuarioLogin usuarioParaAutenticar) {
        Optional<?> objetoOptional = servicos.autenticador(usuarioParaAutenticar);

        if (objetoOptional.isEmpty()) {
            return ResponseEntity.status(400).build();
        } else {
            return ResponseEntity.status(201).body(objetoOptional.get());
        }
    }


}







