package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Endpoint to register a new user
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User savedUser = userService.saveUser(user);
        return ResponseEntity.ok(savedUser);
    }

    // Endpoint to get a user by user_id
    @GetMapping("/{user_id}")
    public ResponseEntity<User> getUserById(@PathVariable("user_id") String userId) {
        User user = userService.findById(userId);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }
    

    //register a new user
    @PutMapping("/{user_id}")

    public ResponseEntity<User> updateUser(@PathVariable("user_id") String userId, @RequestBody User user) {
        
            //connect the request userid to the user object
            user.setUser_id(userId);
            //set all the values of the user object to the new values
            User updatedUser = userService.saveUser(user);
            return ResponseEntity.ok(updatedUser);
    }

    // Endpoint to log in a user
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User loginRequest) {
        if (loginRequest.getUser_id() == null) {
            return ResponseEntity.status(400).body("User ID must not be null");
        }
    
        User foundUser = userService.findById(loginRequest.getUser_id());
    
        // Check if user exists and the password matches
        if (foundUser != null && foundUser.getPassword().equals(loginRequest.getPassword())) {
            return ResponseEntity.ok("Login successful");
        }
        return ResponseEntity.status(401).body("Invalid user_id or password");
    }
}