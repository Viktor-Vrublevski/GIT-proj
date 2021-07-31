package com.example.git_study.entity;

public class Dog {
    private long id;
    private User user;
    private String name;
    private byte age;

    public Dog() {
    }

    public Dog(long id, User user, String name, byte age) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
