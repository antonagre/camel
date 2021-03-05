package com.superteam.camel;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;


public interface ProductRepository extends MongoRepository<Product, ObjectId> {

     Product findProductByName(String name);
     Product findProductByRef(String ref);
}
