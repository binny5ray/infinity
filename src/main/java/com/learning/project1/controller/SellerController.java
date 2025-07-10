package  com.learning.project1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.project1.model.Seller;
import com.learning.project1.services.SellerService;


@RestController
@RequestMapping("/api/v1/seller")
public class SellerController {
    @Autowired
    private SellerService service;

    @PostMapping("/addSeller")
    public Seller addSeller(@RequestBody Seller seller){
        return service.addSeller(seller);
    }

}
