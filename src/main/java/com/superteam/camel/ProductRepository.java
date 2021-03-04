package com.superteam.camel;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, ObjectId> {

    public Product findProductByName(String name);
    public Product findProductByRef(String ref);
}
