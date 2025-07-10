package com.learning.project1.controller;

import com.learning.project1.repository.contactRepository;
import com.learning.project1.model.contactEntity;
import com.learning.project1.services.contactService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/contact")
public class contactController {

    @Autowired
    private contactService contactService; // autowiring contact service

    @PostMapping
    public contactEntity addContact(@RequestBody contactEntity contact) {
        //TODO: process POST request
        // use contact service for business login
        return contactService.addContact(contact);
        //return entity;
    }

    @GetMapping
    public List<contactEntity> getAllContact() {
        return contactService.findAll();
    }
    
    
}
