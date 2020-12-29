package com.firstspringboot.crudapi.repository;

import com.firstspringboot.crudapi.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products,Integer> {
    Products findByName(String name);
}

