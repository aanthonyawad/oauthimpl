package com.awad.anthony.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awad.anthony.security.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);
}
