package com.example.experiment.experiment;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String testMethod()
    {
        return "hello world";
    }
}
