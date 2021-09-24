package com.example.price;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {

    @Autowired
    PriceService priceService;

    @GetMapping("/product/{productName}")
    public Product getProduct(@PathVariable String productName) {
        return priceService.getPrice(productName);
    }
}