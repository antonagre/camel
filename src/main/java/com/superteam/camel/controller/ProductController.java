package com.superteam.camel.controller;

import com.superteam.camel.command.ProductCommand;
import com.superteam.camel.model.PriceHistory;
import com.superteam.camel.repository.IHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/camel/products")
public class ProductController {

    @Autowired
    IHistoryRepository historyRepo;

    @GetMapping("/crea")
    public String creaProdotto1(@RequestParam String name) {
        System.out.println("prima crea");

        System.out.println("fine");
        return name;
    }

    @GetMapping("/test")
    public void creaProdotto() {
        HashMap<String,String> map = new HashMap();
        map.put("ciao","bau");
        historyRepo.save(PriceHistory.builder().history(map).productId("test").build());
    }

    @GetMapping("/crea/")
    public String creaProdotto2(@RequestBody ProductCommand p) {
        System.out.println(p.getName());
        return "200";
    }




}
