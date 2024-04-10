package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ApiContoller {
    @GetMapping("/StudentName")
    public String Name(@RequestParam(name = "id") String name) {
        return "Welcome " + name + " !";
    }

}
