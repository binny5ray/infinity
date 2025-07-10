package com.learning.project1.repository;

import org.springframework.stereotype.Repository;
import com.learning.project1.model.ProductListing;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface ProductListingRepository extends JpaRepository<ProductListing, Long> {
    // query
}
