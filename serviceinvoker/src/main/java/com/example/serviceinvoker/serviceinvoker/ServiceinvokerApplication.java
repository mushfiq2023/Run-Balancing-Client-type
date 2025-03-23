package com.example.serviceinvoker.serviceinvoker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServiceinvokerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceinvokerApplication.class, args);
    }

    @Bean
    @LoadBalanced  // Works with Eureka
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
