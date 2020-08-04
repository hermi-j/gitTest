package com.example.demo.dto;

import com.example.demo.entity.Files;
import com.example.demo.entity.Recipes;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
public class StepDto {
    private Integer id;
    private String stepName;
    private String dateOfCreation;
}
