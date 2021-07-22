package com.example.demowebapp2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleRestController {

    @GetMapping("/asd/")
    public String hello(){
        return "index";
    }
}