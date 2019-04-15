package com.lxgzhw520.day004.demo03_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-15
# 文件名称: Student.java
# 开发工具: IDEA
*/

public class Student {
    //id自增
    private int id;
    private String name;
    private int age;
    static String room;//所在教室
    private static int idCounter = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }


    public Student() {
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
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

    public void show() {
        System.out.println("================");
        System.out.println("班级:" + room);
        System.out.println("学号:" + this.id);
        System.out.println("姓名:" + this.name);
        System.out.println("年龄:" + this.age);
        System.out.println("================");
    }
}
