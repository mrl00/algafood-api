package com.algaworks.algafood_api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/health_check")
    public ResponseEntity<?> healthCheck() {
        return ResponseEntity.ok().build();
    }
}
