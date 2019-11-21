package com.wpl.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wpl.cursomc.domain.Pedido;

public interface PedidoRepository extends JpaRepository <Pedido,Integer> {

}
