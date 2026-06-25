package com.example.testing.service;

import com.example.testing.entity.Product;
import com.example.testing.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAll() {
        return repo.findAll();
    }

    public Product getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Product create(Product product) {
        return repo.save(product);
    }

    public Product update(Long id, Product product) {
        Product existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setNama(product.getNama());
            existing.setQty(product.getQty());
            existing.setKeterangan(product.getKeterangan());
            return repo.save(existing);
        }
        return null;
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}   