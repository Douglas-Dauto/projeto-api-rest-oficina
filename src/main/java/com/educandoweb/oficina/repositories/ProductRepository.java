package com.educandoweb.oficina.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.oficina.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
