package com.superteam.camel.controller;

import com.superteam.camel.Product;
import com.superteam.camel.ProductCommand;
import com.superteam.camel.ProductRepository;
import com.superteam.camel.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/camel/products")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/cerca")
    public String cercaProdotto(@RequestParam String name) {
       service.findProductByName(name);
        return name;
    }

    @PostMapping("/crea")
    public String creaProdotto(@RequestParam String name, String ref) {
        service.creaProdotto(name,ref);
        System.out.println(name);
        return name;
    }



}
