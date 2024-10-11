package org.example.models;

public class Student {
    private Integer id;
    private String name;
    private String email;
    private University university;


    public Student(Integer id, String name, String email, University university) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.university = university;

    }

    public Student() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public University getUniverty() {
        return university;
    }

    public void setUniverty(University univerty) {
        this.university = univerty;
    }



}
