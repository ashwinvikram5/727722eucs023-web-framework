package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ApiContoller {
    @GetMapping("/favouriteColor")
    public String color(@RequestParam(name = "id") String color) {
        return "My favourite color is " + color;
    }

}
