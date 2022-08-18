package com.example.api_gateway_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayClientApplication.class, args);
    }

}
