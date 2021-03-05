package com.superteam.camel;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
@Data
@Builder

public class Product {

    String name;
    String ref;
    float price;

}
