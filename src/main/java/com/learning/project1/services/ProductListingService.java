package com.learning.project1.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.project1.repository.*;

import com.learning.project1.model.*;

/*
 * {
  "sellerName": "Vinayak Electronics",
  "productName": "...",
  "price": 999,
  "stock": 10
}
 */

@Service
public class ProductListingService {
    @Autowired
    private ProductListingRepository repository;

    @Autowired
    private SellerRepository sellerRepo;

    @Autowired
    private ProductRepository productRepo;

    public ProductListing addProductListing(Map<String, String> listing){
        // check if the seller exist
        Seller seller = sellerRepo.findByName(listing.get("sellerName"));
        if(seller == null){
            seller = new Seller();
            seller.setName(listing.get("sellerName"));
            sellerRepo.save(seller);
        }
        Product product = productRepo.findByName(listing.get("productName"));
        if(product == null){
            product = new Product();
            product.setName(listing.get("productName"));
            productRepo.save(product);
        }
        ProductListing newListing = new ProductListing();
        newListing.setPrice(Float.parseFloat(listing.get("price")));
        newListing.setProduct(product);
        newListing.setSeller(seller);
        return repository.save(newListing);
    }
}
