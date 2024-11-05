package com.ohgiraffers.elasticbeans_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    @GetMapping("health")
    public String healthCheck() {
        return "eb_proj is fine!";
    }
}
