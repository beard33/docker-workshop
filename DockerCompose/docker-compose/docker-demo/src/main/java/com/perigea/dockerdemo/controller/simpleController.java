package com.perigea.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class simpleController {

    @GetMapping("/greetings/")
    public String getGreeted(@RequestParam String name) {
        return String.format("Hello %s!", name);
    }
}
