package com.firstspringboot.crudapi.service;

import com.firstspringboot.crudapi.entity.Products;
import com.firstspringboot.crudapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Products saveProduct(Products products) {
//        System.out.println("Save Product");
        return repository.save(products);
    }

    public List<Products> saveProducts(List<Products> products) {
        return repository.saveAll(products);
    }

    public List<Products> getProducts() {
        return repository.findAll();
    }

    public Products getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Products getProductByName(String name) {
        return repository.findByName(name);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Products updateProduct(Products products) {
        Products existingProducts = repository.findById(products.getId()).orElse(null);
        existingProducts.setName(products.getName());
        existingProducts.setQuantity(products.getQuantity());
        existingProducts.setPrice(products.getPrice());
        return repository.save(existingProducts);
    }


}
