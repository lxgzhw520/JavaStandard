package com.lxgzhw520.day002.demo04_test;

public class Student {
    private String name;
    private double age;
    private boolean gender;

    public Student() {
    }

    public Student(String name, double age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public static void sayHello(String name) {
        System.out.println(name + "你好,我是");
    }
}
