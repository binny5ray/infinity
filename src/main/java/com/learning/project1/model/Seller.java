package com.learning.project1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

import jakarta.persistence.CascadeType;

@Entity
@Data
public class Seller {
    
    @Id @GeneratedValue
    private Long id;

    private String name;
    
    @OneToMany(mappedBy="seller", cascade=CascadeType.ALL)
    private List<ProductListing> listings;

}
