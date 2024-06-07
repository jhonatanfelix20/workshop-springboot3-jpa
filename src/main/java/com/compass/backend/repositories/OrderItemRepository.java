package com.compass.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compass.backend.entities.OrderItem;
import com.compass.backend.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

	
}
