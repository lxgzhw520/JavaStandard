package com.lxgzhw520.day005.demo01_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-16
# 文件名称: Main.java
# 开发工具: IDEA
*/

public class Main {
    public static void main(String[] args) {
        Student zbf = new Student("张宝富", 33);
        System.out.println(zbf.getName());
        System.out.println(zbf.getAge());
        System.out.println("---------------------------");
        zbf.show();
        System.out.println("---------------------------");
        System.out.println(zbf.add(33, 33));
    }
}
