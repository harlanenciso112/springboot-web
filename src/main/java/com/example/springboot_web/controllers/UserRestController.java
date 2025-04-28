package com.example.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_web.models.User;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")


public class UserRestController {
    
    @GetMapping("/details")
    public Map<String, Object> details(){

        User user = new User("Harlan", "Enciso");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola mundo");
        body.put("user", user);
        

        return body;
    }
}
