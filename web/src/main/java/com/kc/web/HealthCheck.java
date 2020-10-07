package com.kc.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("health")
    String healthCheck(){
        return "status: ok";
    }
}
