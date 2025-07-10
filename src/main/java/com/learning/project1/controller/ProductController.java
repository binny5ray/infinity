package  com.learning.project1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.project1.model.*;
import com.learning.project1.services.*;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    private ProductService service;
    
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.addProduct(product);
    }
}
