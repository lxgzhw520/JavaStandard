package com.lxgzhw520.day006.demo05_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-16
# 文件名称: Main.java
# 开发工具: IDEA
*/

public class Main {
    public static void main(String[] args) {
        //子类找不到的变量去父类找
        var a = new B();
        System.out.println(a.a);
        //b没有的就去父类找
        System.out.println(a.b);
    }
}
