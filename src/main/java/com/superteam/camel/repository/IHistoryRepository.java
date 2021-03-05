package com.superteam.camel.repository;

import com.superteam.camel.model.PriceHistory;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IHistoryRepository extends MongoRepository<PriceHistory, ObjectId> {
    public PriceHistory findProductByProductId(String productId);

}
