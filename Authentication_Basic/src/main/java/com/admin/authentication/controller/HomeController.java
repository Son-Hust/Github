package com.admin.authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/hehe")
    public String greeting() {
        return "Hello, World!";
    }

}
