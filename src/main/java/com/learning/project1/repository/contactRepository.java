package com.learning.project1.repository;

import com.learning.project1.model.contactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface contactRepository extends JpaRepository<contactEntity, Long>{
    // write query if needed
    
}
