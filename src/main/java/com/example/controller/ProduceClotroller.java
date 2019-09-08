package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pro")
public class ProduceClotroller {
    @RequestMapping("pro")
    public String pro(){
        return "this is pro";
    }
}
