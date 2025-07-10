package com.learning.project1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.learning.project1.services.CustomerService;
import com.learning.project1.model.CustomerEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;



@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    private CustomerService service;

    @GetMapping
    public List<CustomerEntity> getAll(){
        return service.getAll();
    }

    @GetMapping("/search/page")
    public Page<CustomerEntity> getByPage(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        return service.searchByPage(page, size);
    }
    

    @PostMapping
    public CustomerEntity add(@RequestBody CustomerEntity customer){
        return service.add(customer);
    }
}
