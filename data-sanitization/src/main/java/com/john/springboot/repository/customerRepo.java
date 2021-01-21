package com.john.springboot.repository;

import com.john.springboot.entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepo extends JpaRepository<customer,Integer> {
}
