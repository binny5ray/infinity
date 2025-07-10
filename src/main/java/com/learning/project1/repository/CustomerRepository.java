package com.learning.project1.repository;

import com.learning.project1.model.CustomerEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>{
    
}
