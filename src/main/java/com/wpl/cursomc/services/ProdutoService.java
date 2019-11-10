package com.wpl.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wpl.cursomc.domain.Produto;
import com.wpl.cursomc.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repo;
		public Produto buscar(Integer id) {
			Optional<Produto> obj = repo.findById(id);
			return obj.orElse(null);
			}
	}
