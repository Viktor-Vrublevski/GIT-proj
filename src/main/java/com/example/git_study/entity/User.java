package com.example.git_study.entity;

public class User {
    private long id;
    private String name;
    private int age;
    private Dog dog;

    public User() {
    }

    public User(long id, String name, int age, Dog dog) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dog = dog;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
