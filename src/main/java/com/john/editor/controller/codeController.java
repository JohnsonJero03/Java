package com.john.editor.controller;

import com.john.editor.entity.code;
import com.john.editor.repository.codeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class codeController {

    @Autowired
    private codeRepo codeRepo;


    @PostMapping("/rawcode/add")
    public code addRawCode(@RequestBody code c)
    {
//        code c = new code();
//        c.setRaw_code(rawCoude);
        return  codeRepo.save(c);
    }

//    @PostMapping("/rawcode/add")
//    public code addRawCode(@RequestParam("code") String rawCoude)
//    {
//        code c = new code();
//        c.setRaw_code(rawCoude);
//        return  codeRepo.save(c);
//    }

    @GetMapping("/rawcode/get")
    public List<code> getTheCode()
    {
        return codeRepo.findAll();
    }

    @GetMapping("/rawcode/getbyid/{id}")
    public Optional<code> getById(@PathVariable Integer id)
    {
        return codeRepo.findById(id);
    }
}
