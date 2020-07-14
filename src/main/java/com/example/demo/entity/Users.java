package com.example.demo.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Users implements UserDetails {
    @Id
    @Column
    private Integer id;
    @Column
    private String email;
    @Column
    private String username;
    @Column
    private String password;
    @Column(name="is_active")
    private Boolean isActive;
    @Column(name="date_of_creation")
    private String dateOfCreation;
    @Column
    private String role;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "users_x_recipes",
            joinColumns = {@JoinColumn(name = "user_id")},
                    inverseJoinColumns = {@JoinColumn(name = "recipe_id")})
    private Set<Recipes> recipes= new HashSet<>();

    @OneToMany(mappedBy = "user")
    private List<Files> files;

    @OneToMany(mappedBy = "user")
    private List<Comments> comments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return isActive;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
