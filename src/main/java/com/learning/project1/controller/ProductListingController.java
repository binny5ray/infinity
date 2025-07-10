package  com.learning.project1.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.project1.model.*;
import com.learning.project1.services.*;

/*
 * {
  "sellerName": "Vinayak Electronics",
  "productName": "...",
  "price": 999,
  "stock": 10
}
 */
@RestController
@RequestMapping("/api/v1/productListing")
public class ProductListingController {
    @Autowired
    private ProductListingService service;

    @PostMapping("/addProductListing")
    public ProductListing addProductListing(@RequestBody Map<String, String> listing){
        return service.addProductListing(listing);
    }
}
