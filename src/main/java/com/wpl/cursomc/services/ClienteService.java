package com.wpl.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wpl.cursomc.domain.Cliente;
import com.wpl.cursomc.repositories.ClienteRepository;
import com.wpl.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
		public Cliente buscar(Integer id) {
			Optional<Cliente> obj = repo.findById(id);
			return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + " Tipo : "+ Cliente.class.getName()));
			}
	}
