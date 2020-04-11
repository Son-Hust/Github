package com.admin.manager.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tbl_dev_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank(message = "Name is required!")
    private String name;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotBlank(message = "Password is required!")
    @Size(min = 8,max = 16,message = "Enter the password that meets the following conditions:\n" +
            "> = 8 and <= 16 characters\n" +
            "Include uppercase, lowercase letters, numbers, and special characters")
    private String password;
    @Email(message = "Email format is incorrect!")
    @NotBlank(message = "Email is required!")
    private String email;
    @NotBlank(message = "Address must not be blank!")
    private String address;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
