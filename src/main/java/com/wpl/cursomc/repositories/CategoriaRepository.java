package com.wpl.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wpl.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria,Integer> {

}
