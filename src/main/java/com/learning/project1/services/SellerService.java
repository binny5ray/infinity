package com.learning.project1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.learning.project1.repository.SellerRepository;

import com.learning.project1.model.Seller;


@Service
public class SellerService {
    @Autowired
    private  SellerRepository repository;

    public Seller addSeller(Seller seller){
        return repository.save(seller);
    }

}