package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name ="Admin")


public class Admin {

   
    @Id
    @Column(nullable = false)
    private String admin_id;
    

    @Column (nullable =false, name ="admin_name")
    private String adminName;

    @Column (nullable = false )
    private String password;
    
    @Column (nullable = false)
    private String email;

    @Column (nullable = false)
    private String phone_number;

    // Getters and Setters

    public String getAdmin_id() {
        return admin_id;
    }
    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdminName() {
        return adminName;
    }
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }



    
}
