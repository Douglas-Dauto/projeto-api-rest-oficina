package com.educandoweb.oficina.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.oficina.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
