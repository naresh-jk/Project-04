package com.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;

/**
 * Simple REST Controller to demonstrate a runnable endpoint.
 * This file is located at: src/main/java/com/poc/controller/DemoController.java
 */
@RestController
public class DemoController {

    // Inject the application version from pom.xml
    @Value("${info.app.version:unknown}")
    private String appVersion;

    /**
     * Responds to GET requests at the root path.
     * @return A welcome message including the application version.
     */
    @GetMapping("/")
    public ResponseEntity<String> hello() {
        String message = String.format(
            "Hello from the CI/CD Demo Application! Version: %s. Status: OK.",
            appVersion
        );
        return ResponseEntity.ok(message);
    }
}