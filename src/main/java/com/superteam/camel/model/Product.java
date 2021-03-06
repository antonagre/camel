package com.superteam.camel.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
@Data
@Builder

public class Product {
    @Id
    String _id;
    String ref;
    String name;
    float price;

}
