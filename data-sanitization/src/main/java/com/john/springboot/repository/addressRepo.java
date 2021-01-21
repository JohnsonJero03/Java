package com.john.springboot.repository;

import com.john.springboot.entity.address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface addressRepo extends JpaRepository<address,Integer> {
}
