package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Step {
    @Id
    @Column
    private Integer id;
    @Column(name = "step_name")
    private String stepName;
    @Column(name = "date_of_creation")
    private String dateOfCreation;

    @ManyToOne
    @JoinColumn(name = "recipe_id",referencedColumnName = "id")
    private Recipes recipe;

    @OneToMany(mappedBy = "step")
    private List<Files>files;
    public Step() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
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
}
