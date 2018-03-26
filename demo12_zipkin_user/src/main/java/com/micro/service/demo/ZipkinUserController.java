package com.micro.service.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipkinUserController {

    @GetMapping("/zipkin/user/hi")
    public String hi() {
        return "I'm zipkin user HI";
    }
}
