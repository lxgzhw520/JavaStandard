package com.lxgzhw520.day002.demo05_test;

public class Student {
    private String name;
    private int age;
    private String class_no;

    public Student() {
    }

    public Student(String name, int age, String class_no) {
        this.name = name;
        this.age = age;
        this.class_no = class_no;
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

    public String getClass_no() {
        return class_no;
    }

    public void setClass_no(String class_no) {
        this.class_no = class_no;
    }
}
