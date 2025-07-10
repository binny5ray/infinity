package com.learning.project1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.learning.project1.repository.*;

import com.learning.project1.model.*;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product addProduct(Product product){
        return repository.save(product);
    }
}
