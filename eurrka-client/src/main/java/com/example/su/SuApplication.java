package com.example.su;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SuApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuApplication.class, args);
    }

}
