package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping
    public String hello() {
        return "Hello from container! v2";
    }

    @GetMapping("/turn-off")
    public void turnOff() {
        System.exit(3);
    }
}