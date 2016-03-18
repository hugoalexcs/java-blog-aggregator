package com.aprendendo.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendo.spring.entity.Blog;
import com.aprendendo.spring.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

	List<Blog> findByUser(User user);
}
