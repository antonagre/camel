package com.superteam.camel.service;

import com.superteam.camel.model.Product;
import com.superteam.camel.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    @Autowired
    IProductRepository repo;

    public Product creaProdotto(String name, String ref) {
        Product p = Product.builder().name(name).ref(ref).build();
        repo.save(p);

        return p;
    }

    public Product findProductByName(String name){
        return repo.findProductByName(name);
    }

    public Product findProductByRef(String ref){
        return repo.findProductByRef(ref);
    }
}
