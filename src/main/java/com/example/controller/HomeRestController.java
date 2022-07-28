package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

    @GetMapping("/home")
    public String simpleHomepage() {
        return "Welcome to this simple homepage!";
    }

}
