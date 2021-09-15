package com.blog.pessoal.atividade.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.pessoal.atividade.Model.Tema;
import com.blog.pessoal.atividade.Repository.TemaRepository;

@Service
public class TemaService {
	private @Autowired TemaRepository repository;
	
	/**
     * Método utilizado para alterar um tema que retorna um Optional com Tema caso
     * correto ou um Optional.empyt() caso id do tema não exista.
     * 
     * @param temaParaAlterar do tipo Tema
     * @return Optional com Tema alterado
     * @since 1.0
     * @author Bruno Daniel Turma 29
     */
	
	public Optional<Tema> atualizarTema(Tema temaParaAlterar) {
        return repository.findById(temaParaAlterar.getIdTema()).map(temaExistente -> {
            temaExistente.setTema(temaParaAlterar.getTema());
            return Optional.ofNullable(repository.save(temaExistente));
        }).orElseGet(() -> {
            return Optional.empty();
        });
    }
}
