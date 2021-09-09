package com.blog.pessoal.atividade.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.pessoal.atividade.Model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	 List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
	 Optional<Usuario> findByEmail(String Email);
	 
}
