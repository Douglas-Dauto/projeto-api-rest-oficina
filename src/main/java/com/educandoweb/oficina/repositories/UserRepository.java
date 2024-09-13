package com.educandoweb.oficina.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.oficina.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
