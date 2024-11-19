package com.example.demo.service;

import com.example.demo.entity.Admin;
import com.example.demo.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository AdminRepository;

    // Method to save a user (registration check)
    public Admin saveAdmin(Admin admin) {
        return AdminRepository.save(admin);
    }

    // Method to find a user by ID (login check)
    public Admin findById(String admin_id) {
        return AdminRepository.findById(admin_id).orElse(null);
    }
}