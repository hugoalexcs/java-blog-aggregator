package com.aprendendo.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendo.spring.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByName(String name);

}
