package com.ATVSpring.turma29.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface temarepositorio extends JpaRepository<postagem, Long>
{

}
