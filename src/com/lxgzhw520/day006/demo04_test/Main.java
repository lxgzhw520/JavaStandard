package com.lxgzhw520.day006.demo04_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-16
# 文件名称: Main.java
# 开发工具: IDEA
*/

public class Main {
    public static void main(String[] args) {
        //多态就是父类实例子类
        //方式1
        A a = new B();
        a.show();

        //方式2
        var a1 = new B();
        a1.show();
    }
}
