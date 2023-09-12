package com.example.uzummarkets.controller;

import com.example.uzummarkets.dto.UserDTO;
import com.example.uzummarkets.entity.UserEntity;
import com.example.uzummarkets.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    private final UserService userService;
    @PostMapping("/sign-up")
    public ResponseEntity<UserEntity> signUp(
            @RequestBody UserDTO userDTO
            ) {
       return ResponseEntity.ok(userService.save(userDTO));
    }

    @GetMapping("/sign-in")
    public ResponseEntity<UserEntity> signIn(
            @RequestParam String email,
            @RequestParam String password
    ) {
        return ResponseEntity.ok(userService.signIn(email, password));
    }
}
