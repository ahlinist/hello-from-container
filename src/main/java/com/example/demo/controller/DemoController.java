package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping
    public String hello() {
        return "Hello from container! v15";
    }

    @GetMapping("/hello")
    public String helloPath() {
        return "Hello from container with context path! v15";
    }

    @GetMapping("/turn-off")
    public void turnOff() {
        System.exit(0);
    }
}
