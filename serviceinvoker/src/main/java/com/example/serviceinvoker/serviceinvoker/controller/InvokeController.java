package com.example.serviceinvoker.serviceinvoker.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/invoker")
public class InvokeController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/call")
    public String callProvider() {
        // URL for Eureka-based discovery OR manual Ribbon Load Balancing
        String providerUrl = "http://service-provider/provider/service";
        
        return restTemplate.getForObject(providerUrl, String.class);
    }
}

