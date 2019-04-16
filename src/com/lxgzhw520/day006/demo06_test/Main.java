package com.lxgzhw520.day006.demo06_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-16
# 文件名称: Main.java
# 开发工具: IDEA
*/

public class Main {
    public static void main(String[] args) {
        //将父类转换为子类
        A b = new B();
        b.showa();

        //需要重新定义一个变量来接收
        B b1 = (B) b;
        b1.showb();
        b1.showa();

        //方法2
        System.out.println("----------------");
        var b2 = new B();
        b2.showa();
        b2.showb();
    }
}
