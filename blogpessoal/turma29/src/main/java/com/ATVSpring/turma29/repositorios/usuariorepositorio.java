package com.ATVSpring.turma29.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usuariorepositorio extends JpaRepository<usuario,Long>
{

}
