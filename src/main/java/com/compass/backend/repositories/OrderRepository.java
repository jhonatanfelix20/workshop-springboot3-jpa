package com.compass.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compass.backend.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
