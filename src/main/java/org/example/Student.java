package org.example;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private String gender;
    Student(){};


    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
