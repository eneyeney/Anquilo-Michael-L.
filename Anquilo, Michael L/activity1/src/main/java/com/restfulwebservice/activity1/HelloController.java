package com.restfulwebservice.activity1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/michael")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, My Name Is Michael L. Anquilo, BSIT-4A!";
    }

}
