package com.courseEx.firstex.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class saiHi {

    @RequestMapping("/hello")
    public String message()
    {
        return "Hi";
    }
}
