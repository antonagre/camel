package com.superteam.camel.controller;

import com.superteam.camel.command.ProductCommand;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/camel/products")
public class ProductController {

    @GetMapping("/crea")
    public String creaProdotto1(@RequestParam String name) {
        System.out.println("prima crea");

        System.out.println("fine");
        return name;

    }

    @GetMapping("/crea/{name}")
    public String creaProdotto(@PathVariable String name) {
        System.out.println(name);
        return name;
    }
    @GetMapping("/crea/")
    public String creaProdotto2(@RequestBody ProductCommand p) {
        System.out.println(p.getName());
        return "200";

    }




}
