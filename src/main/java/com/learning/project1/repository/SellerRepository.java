package com.learning.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.learning.project1.model.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long>{
    // query
    public Seller findByName(String name);
}
