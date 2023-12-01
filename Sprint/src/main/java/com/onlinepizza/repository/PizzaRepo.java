package com.onlinepizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlinepizza.entity.Pizza;

public interface PizzaRepo extends JpaRepository<Pizza, Integer> {
	

}
