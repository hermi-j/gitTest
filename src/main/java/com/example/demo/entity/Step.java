package com.example.demo.entity;

import com.example.demo.dto.StepDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
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
    @JoinColumn(name = "recipe_id", referencedColumnName = "id")
    private Recipes recipe;

    @OneToMany(mappedBy = "step")
    private List<Files> files;

    public Step() {
    }
//конструктор копирования
    public Step(StepDto stepDto) {

    }
}
