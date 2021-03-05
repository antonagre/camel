package com.superteam.camel.repository;

import com.superteam.camel.model.Product;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;


public interface IProductRepository extends MongoRepository<Product, ObjectId> {

     Product findProductByName(String name);
     Product findProductByRef(String ref);
     Product findProductByNameContains(String name);
     Product findProductByNameContainsAndPriceIsLessThan(String name,float price);
}
