package com.taskmanager.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvTestController {
    @Value("${jwt.secret}")
    private String jwtSecret;

    @GetMapping("/env")
    public String env() {
        return "JWT Secret: " + jwtSecret;
    }
}
