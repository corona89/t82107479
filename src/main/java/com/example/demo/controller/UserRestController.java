package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
    private UserService userService;

    public UserRestController() {
        this.userService = new UserService();
    }

    @GetMapping(value = "/api/v1/user")
    public ResponseEntity<?> getUser() throws Exception {
        return ResponseEntity.ok(userService.getUser());
    }
}
