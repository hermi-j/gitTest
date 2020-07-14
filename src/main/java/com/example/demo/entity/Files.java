package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table
public class Files {
    @Id
    @Column
    private Integer id;
    @Column(name = "file_name")
    private String fileName;
    @Column
    private String type;
    @Column(name = "date_of_creation")
    private String dateOfCreation;

    @ManyToOne
    @JoinColumn(name = "step_id",referencedColumnName = "id")
    private Step step;

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private Users user;

    public Files() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Step getStep() {
        return step;
    }

    public void setStep(Step step) {
        this.step = step;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
