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
        String html = String.format(
            "<!DOCTYPE html>" +
            "<html>" +
            "<head>" +
            "    <title>CI/CD Demo</title>" +
            "</head>" +
            "<body>" +
            "    <h1>Hello Everyone!</h1>" +
            "    <p>CI/CD Demo Application Deployed in ngrok</p>" +
            "    <p>Version: %s</p>" +
            "    <p>Status: OK</p>" +
            "</body>" +
            "</html>",
            appVersion
        );
    return ResponseEntity.ok()
        .header("Content-Type", "text/html")
        .body(html);
}
}