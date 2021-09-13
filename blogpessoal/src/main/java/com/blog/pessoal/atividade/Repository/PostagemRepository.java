package com.blog.pessoal.atividade.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.pessoal.atividade.Model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

}
