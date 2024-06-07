package com.compass.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compass.backend.entities.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	
}
