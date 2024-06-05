package com.compass.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compass.backend.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
