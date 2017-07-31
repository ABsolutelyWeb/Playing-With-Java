package com.company;

public class Student {

    int id;
    String name;
    String gender = "male";

    public Student (int id, String name) {
        this(name);
        this.id = id;
    }

    public Student (String name) {
        this.name = name;
    }

    public void updateProfile(String newName) {
        this.name = newName;
    }
}
