package com.wpl.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wpl.cursomc.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository <Pagamento,Integer> {

}
