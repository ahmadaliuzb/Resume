package com.example.resume2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/message")
    public String message() {
        return "message";
    }

    @PostMapping("/send")
    public String send(@RequestParam("firstName") String firstName, @RequestParam("message") String message) {
        System.out.println(firstName);
        System.out.println(message);
        return "success";
    }
}
