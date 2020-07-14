package com.example.demo.controller;

import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home() {
        userRepository.findByUsername("milka_way");
        return "home";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
