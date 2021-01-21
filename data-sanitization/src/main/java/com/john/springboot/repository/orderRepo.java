package com.john.springboot.repository;

import com.john.springboot.entity.placeorder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderRepo extends JpaRepository<placeorder,Integer> {
}
