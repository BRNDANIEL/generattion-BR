package com.blog.pessoal.atividade.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.pessoal.atividade.Model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {

}
