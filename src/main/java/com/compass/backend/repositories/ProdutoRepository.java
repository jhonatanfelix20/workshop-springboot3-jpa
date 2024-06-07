package com.compass.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compass.backend.entities.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	
}
