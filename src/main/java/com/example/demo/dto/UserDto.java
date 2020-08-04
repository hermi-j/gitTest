package com.example.demo.dto;

import com.example.demo.entity.Users;

public class UserDto {
    private Integer id;
    private String username;
    private String password;
    private String passwordConfirm;

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserDto() {
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
}

