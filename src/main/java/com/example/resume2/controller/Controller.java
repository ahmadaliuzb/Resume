package com.example.resume2.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/message")
    public String message(){
        return "message";
    }
}
