package com.admin.manager.model;

import com.admin.manager.validate.password.ValidPassword;

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
    @Size(max = 10,message = "Name input within 10 characters!" )
    private String name;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotBlank(message = "Password is required!")
    @ValidPassword
    private String password;
    @Email(message = "Email format is incorrect!")
    @NotBlank(message = "Email is required!")
    @Size(max = 20,message = "Email input within 20 characters!")
    private String email;
    @NotBlank(message = "Address is required!")
    @Size(max = 30,message = "Address input within 30 characters!")
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
