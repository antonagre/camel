package com.superteam.camel;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    @Autowired
    ProductRepository repo;

    public Product creaProdotto(String name, String ref) {
        Product p = Product.builder().name(name).ref(ref).build();
        repo.save(p);

        return p;
    }

    public Product findProductByName(String name){
        return repo.findProductByName(name);
    }
}
