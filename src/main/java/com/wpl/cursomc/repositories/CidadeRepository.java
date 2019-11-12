package com.wpl.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wpl.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository <Cidade,Integer> {

}
