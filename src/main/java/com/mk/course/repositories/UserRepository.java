package com.mk.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mk.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
