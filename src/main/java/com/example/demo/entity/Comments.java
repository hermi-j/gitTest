package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table
public class Comments {
    @Id
    @Column
    private Integer id;
    @Column
    private String value;
    @Column(name = "date_of_creation")
    private String dateOfCreation;

    @ManyToOne
    @JoinColumn(name = "recipe_id",referencedColumnName = "id")
    private Recipes recipe;

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private Users user;

    public Comments() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Recipes getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipes recipe) {
        this.recipe = recipe;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
