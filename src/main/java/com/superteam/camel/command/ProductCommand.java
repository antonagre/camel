package com.superteam.camel.command;

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
