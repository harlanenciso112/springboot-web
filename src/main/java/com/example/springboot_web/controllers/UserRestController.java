package com.example.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
    
    @GetMapping("/details2")
    public Map<String, Object> details(){
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola mundo");
        body.put("name", "Harlan");
        body.put("lastname", "Enciso");

        return body;
    }
}
