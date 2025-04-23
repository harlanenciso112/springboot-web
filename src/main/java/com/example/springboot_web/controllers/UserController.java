package com.example.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Hola mundo");
        model.addAttribute("name", "Harlan");
        model.addAttribute("lastname", "Enciso");

        return "details";
    }
    
    @GetMapping("/info")
    public String info(Model model){
        model.addAttribute("title", "Info");
        model.addAttribute("info", "info app");

        return "info";
    }
}
