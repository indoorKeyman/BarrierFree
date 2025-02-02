package com.example.back_end_bf.controller;

import com.example.back_end_bf.dto.UserDTO;
import com.example.back_end_bf.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    private final UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<UserDTO>> getAllUser () {

        System.out.println("getAllUser Operating...");

        return ResponseEntity.ok(userService.getAllUser());
    }

}
