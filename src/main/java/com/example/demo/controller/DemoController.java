package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String hello() {
        return "Hello from container! v17";
    }

    @GetMapping("/hello")
    public String helloPath() {
        return "Hello from container with context path! v17";
    }

    @GetMapping("/crash")
    public ResponseEntity<String> crash() {
        return ResponseEntity.status(500)
                .body("<h1 style=\"color: red; text-align: center;\">ERROR!</h1>");
    }

    @GetMapping("/turn-off")
    public void turnOff() {
        System.exit(0);
    }
}
