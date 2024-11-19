package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User") // Match the SQL table name
public class User {

    @Id
    @Column(nullable = false) // Ensure this maps to the correct column in the database
    private String user_id; // Change to 'userId' for consistency with 'user_id'

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private float weight;

    @Column(nullable = false)
    private float height;

    @Column(nullable = false)
    private String gender;

    @Column(name = "health_condition")
    private String healthCondition;

    // Getters and Setters
    public String getUser_id() { return user_id; }
    public void setUser_id(String user_id) { this.user_id = user_id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public float getWeight() { return weight; }
    public void setWeight(float weight) { this.weight = weight; }

    public float getHeight() { return height; }
    public void setHeight(float height) { this.height = height; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getHealthCondition() { return healthCondition; }
    public void setHealthCondition(String healthCondition) { this.healthCondition = healthCondition; }
}
