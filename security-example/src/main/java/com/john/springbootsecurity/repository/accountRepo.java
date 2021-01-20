package com.john.springbootsecurity.repository;

import com.john.springbootsecurity.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface accountRepo  extends JpaRepository<Account,Integer> {
}
