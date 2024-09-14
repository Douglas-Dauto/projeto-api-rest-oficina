package com.educandoweb.oficina.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.oficina.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
