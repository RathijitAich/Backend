package com.example.demo.controller;

import com.example.demo.entity.Admin;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;

    // Endpoint to login an admin

    @PostMapping("/login")
    public ResponseEntity<String> loginAdmin(@RequestBody Admin loginRequest) {

        
        if (loginRequest.getAdmin_id() == null) {
            return ResponseEntity.status(400).body("Admin ID must not be null");
        }
    
        Admin foundAdmin = adminService.findById(loginRequest.getAdmin_id());
    
        // Check if admin exists and the password matches
        if (foundAdmin != null && foundAdmin.getPassword().equals(loginRequest.getPassword())) {
            return ResponseEntity.ok("Login successful");
        }
        return ResponseEntity.status(401).body("Invalid admin_id or password");
    }
    
}