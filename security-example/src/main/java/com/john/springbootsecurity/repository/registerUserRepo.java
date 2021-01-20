package com.john.springbootsecurity.repository;

import com.john.springbootsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface registerUserRepo extends JpaRepository<User,Integer> {
}
