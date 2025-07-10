package com.learning.project1.services;

import com.learning.project1.repository.contactRepository;
import com.learning.project1.model.contactEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class contactService {
    // the business logic
    @Autowired
    private contactRepository contactRepository;

    public contactEntity addContact(contactEntity contactEntity){
        return contactRepository.save(contactEntity);
    }

    public List<contactEntity> findAll(){
        return contactRepository.findAll();
    }
}
