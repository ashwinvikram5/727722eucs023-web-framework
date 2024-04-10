package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Config.AppConfig;

@RestController
public class ApiController {
    private final AppConfig ac;

    @Autowired
    public ApiController(AppConfig ac) {
        this.ac = ac;
    }

    @GetMapping("/info")
    public String info() {
        return "App Name:" + ac.getAppName() + ",Version:" + ac.getAppVersion();
    }

}
