package com.john.springboot.repository;

import com.john.springboot.entity.items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepo extends JpaRepository<items,Integer> {
}
