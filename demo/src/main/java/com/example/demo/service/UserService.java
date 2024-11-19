package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Method to save a user (registration check)
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Method to find a user by ID (login check)
    public User findById(String user_id) {
        return userRepository.findById(user_id).orElse(null);
    }
}

