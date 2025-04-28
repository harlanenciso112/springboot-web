package com.example.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springboot_web.models.User;

@Controller
public class UserController {
    
    @GetMapping("/details")
    public String details(Model model){

        User user = new User("Harlan", "Enciso");
        model.addAttribute("title", "Hola mundo");
        model.addAttribute("user", user);
        

        return "details";
    }
}
