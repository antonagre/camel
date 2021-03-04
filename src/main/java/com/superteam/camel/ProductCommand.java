package com.superteam.camel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductCommand {
    String name;
    String id;
    float price;
}
