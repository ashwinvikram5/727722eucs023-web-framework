package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.AshwinUser;
import com.example.springapp.service.AshwinUserService;

@RestController
@RequestMapping("/api")
public class AshwinUserController {
    
    @Autowired
    private AshwinUserService userService;

    @PostMapping("/user")
    public ResponseEntity<AshwinUser> post(@RequestBody AshwinUser user)
    {
        if(userService.postUser(user))
        {
            return new ResponseEntity<AshwinUser>(user, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<AshwinUser> getById(@PathVariable int userId)
    {
        AshwinUser user = userService.getById(userId);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<AshwinUser>(user, HttpStatus.OK);
        }
    }

    @GetMapping("/user/byName/{userName}")
    public ResponseEntity<AshwinUser> getByUserName(@PathVariable String userName)
    {
        AshwinUser user = userService.getByUserName(userName);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<AshwinUser>(user, HttpStatus.OK);
        }
    }
}
