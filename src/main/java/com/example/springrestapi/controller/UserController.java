package com.example.springrestapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity getUser() {
        try {
            return ResponseEntity.ok("Everything is ok!");
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body("Bad request!");
        }
    }
}
