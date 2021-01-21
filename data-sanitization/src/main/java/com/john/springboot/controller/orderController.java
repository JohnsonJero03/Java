package com.john.springboot.controller;

import com.john.springboot.dto.customerOrderDto;
import com.john.springboot.entity.customer;
import com.john.springboot.repository.customerRepo;
import com.john.springboot.repository.orderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class orderController {

    @Autowired
    private com.john.springboot.repository.orderRepo orderRepo;

    @Autowired
    private com.john.springboot.repository.customerRepo customerRepo;

    @PostMapping("/customer/order/add")
    public customer placeOrder(@RequestBody customerOrderDto orderDto)
    {
        return customerRepo.save(orderDto.getCustomer());
    }
}
