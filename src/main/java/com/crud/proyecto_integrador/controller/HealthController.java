package com.crud.proyecto_integrador.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HealthController {
    @GetMapping("/health")
    public String healthCheck() {
        return "API working OK!";
    }
}
