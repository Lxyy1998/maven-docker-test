package org.example.demohello2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {

        return "hello：" + UUID.randomUUID();
    }

    @GetMapping("/hello2")
    public String hello2() {

        return "hello2：" + UUID.randomUUID();
    }

}
