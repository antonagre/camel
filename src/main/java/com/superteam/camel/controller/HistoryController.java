package com.superteam.camel.controller;

import com.superteam.camel.command.ListCommand;
import org.springframework.web.bind.annotation.*;

@RestController
public class HistoryController {

    @GetMapping
    public String searchPriceHistory(String url){
        System.out.println("Prima search");

        System.out.println("Fine");
        return url;
    }


    @GetMapping
    public String updateProductList(@RequestBody ListCommand list){
        System.out.println("Prima update");

        System.out.println("Fine");
        return "200";
    }

}
