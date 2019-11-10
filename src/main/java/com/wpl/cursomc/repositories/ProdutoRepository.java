package com.wpl.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wpl.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository <Produto,Integer> {

}
