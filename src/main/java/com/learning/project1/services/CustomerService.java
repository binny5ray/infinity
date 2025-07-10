package com.learning.project1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.learning.project1.repository.CustomerRepository;
import com.learning.project1.model.CustomerEntity;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public CustomerEntity add(CustomerEntity customer){
        return repository.save(customer);
    }

    public List<CustomerEntity> getAll(){
        return repository.findAll();
    }

    public Page<CustomerEntity> searchByPage(int page, int size){
        Pageable pageable = PageRequest.of(page, size);
        return repository.findAll(pageable);
    }
}
