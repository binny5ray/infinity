package com.learning.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.learning.project1.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    // query
    public Product findByName(String name);
}
