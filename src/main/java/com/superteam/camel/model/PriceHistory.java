package com.superteam.camel.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection = "priceHistory")
@Data
@Builder
public class PriceHistory {
    @Id
    String _id;
    String productId;
    Map<String, String> history;
}
