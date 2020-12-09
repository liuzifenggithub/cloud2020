package com.example.springbootweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("index")
    public String index(){
        return "Hello World Web";
    }
}
