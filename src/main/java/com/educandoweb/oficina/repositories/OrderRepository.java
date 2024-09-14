package com.educandoweb.oficina.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.oficina.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
