package com.example.testing.controller;

import com.example.testing.entity.Product;
import com.example.testing.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // GET ALL
    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // CREATE
    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.create(product);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        return service.update(id, product);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}