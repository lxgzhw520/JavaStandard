package com.lxgzhw520.day005.demo01_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-16
# 文件名称: Student.java
# 开发工具: IDEA
*/

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }

    //static方法不能重写
    @Override
    public void show() {
        //调用父类的方法
        super.show();
        System.out.println("看书");
        System.out.println("学习");
        System.out.println("玩游戏");
        System.out.println("找女朋友");
        //子类添加更多内容
        System.out.println("我是子类");
    }

    //带参数的方法重写
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
