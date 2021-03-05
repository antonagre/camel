package com.superteam.camel.controller;

import com.superteam.camel.command.ListCommand;
import com.superteam.camel.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/history")
public class HistoryController {
    @Autowired
    HistoryService service;

    @GetMapping("/get")
    public String searchPriceHistory(@RequestParam String url){
        System.out.println("Prima search");

        System.out.println("Fine");
        return url;
    }


    @GetMapping("/update")
    public String updateProductList(@RequestBody ListCommand list){
        System.out.println("Prima update");
        service.updateList(list);
        System.out.println("Fine");
        return "200";
    }

}
