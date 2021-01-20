package com.john.springbootsecurity.controller;

import com.john.springbootsecurity.entity.Account;
import com.john.springbootsecurity.repository.accountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class empAccount {

    @Autowired
    private accountRepo accountRepo;

    @PostMapping("/employee/accountdetails/add")
    public Account addAccountDetails(@RequestBody Account  account)
    {
        return  accountRepo.save(account);
    }
    @GetMapping("/employee/accountdetails/show")
    public List<Account> showAccountDetails()
    {
        return  accountRepo.findAll();
    }
}
