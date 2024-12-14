package com.redis.mySpringProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("/hello")
    public String getHello(){
        return "hello";

    }
}
