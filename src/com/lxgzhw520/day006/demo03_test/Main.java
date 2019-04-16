package com.lxgzhw520.day006.demo03_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-16
# 文件名称: Main.java
# 开发工具: IDEA
*/

public class Main {
    public static void main(String[] args) {
        //接口是可以多继承的
        var i = new InterfaceImpl();
        //普通方法重写后调用
        i.method1();
        i.methodA();
        //默认方法不用重写 直接调用
        i.method2();
        i.methodD();
    }
}
