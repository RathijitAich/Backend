package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired // dependency injection of UserRepository
    // dependency injection is a technique in which an object receives other objects that it depends on
    //in this case, the UserService class depends on the UserRepository class
    //the @Autowired annotation tells Spring to inject an instance of UserRepository into UserService
    // its like extends which is used to inherit the properties of a class in many oop languages
    private UserRepository userRepository;

    // Method to save a user
    public User saveUser(User user) {
        return userRepository.save(user);
    }//registration check

    // Method to find a user by username
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }//login check
}
