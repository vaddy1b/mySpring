package com.example.dpsclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DpsClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DpsClientApplication.class, args);
    }

}
