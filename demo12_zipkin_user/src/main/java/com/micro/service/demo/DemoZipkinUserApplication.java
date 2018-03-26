package com.micro.service.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoZipkinUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoZipkinUserApplication.class, args);
    }

}
