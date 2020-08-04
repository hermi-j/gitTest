package com.example.demo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Recipes {
    @Id
    @Column
    private Integer id;
    @Column(name="recipe_name")
    private String recipeName;
    @Column(name="date_of_creation")
    private String dateOfCreation;
    @Column
    private Double rating;

    @ManyToMany(mappedBy = "recipes")
    private Set<Users> users = new HashSet<>();

    @OneToMany(mappedBy = "recipe")
    private List <Step> steps;

    @OneToMany(mappedBy = "recipe")
    private List<Comments> comments;

    public Recipes() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Set<Users> getUsers() {
        return users;
    }

    public void setUsers(Set<Users> users) {
        this.users = users;
    }


    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }

}
