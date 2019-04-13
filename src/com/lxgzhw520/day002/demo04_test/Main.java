package com.lxgzhw520.day002.demo04_test;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张大鹏");
        s.setAge(25);
        s.setGender(true);

        System.out.println("姓名:" + s.getName());
        System.out.println("年龄:" + s.getAge());
        System.out.println("是不是男人:" + s.isGender());
    }
}
