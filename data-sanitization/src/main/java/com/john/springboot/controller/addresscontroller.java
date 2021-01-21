package com.john.springboot.controller;

import com.john.springboot.dto.customerAddressDto;
import com.john.springboot.entity.customer;
import com.john.springboot.repository.addressRepo;
import com.john.springboot.repository.customerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class addresscontroller {

    @Autowired
    private customerRepo customerRepo;

    @Autowired
    private addressRepo addressRepo;

    @PostMapping("/address/add")
    public customer addCustomerAddress(@RequestBody customerAddressDto dto)
    {
        return  customerRepo.save(dto.getCustomer());
    }
}
