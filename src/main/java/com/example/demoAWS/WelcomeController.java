package com.example.demoAWS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    public WelcomeController(){};

    @GetMapping("/")
    public String getWelcomeMessage(){

        return " Welcome to demo_AWS!";
    }
}
