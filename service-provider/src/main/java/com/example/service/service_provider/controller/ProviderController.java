package com.example.service.service_provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/service")
public class ProviderController {
	@GetMapping
    public String getService() {
        return "Response from Service Provider - " + Math.random();
    }
}

