package com.lxgzhw520.day007.demo07_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-17
# 文件名称: Main.java
# 开发工具: IDEA
*/

public class Main {
    public static void main(String[] args) {
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("AAAAAAAA");
            }

            @Override
            public void method2() {
                System.out.println("BBBBBBBBB");
            }
        }.method1();
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("AAAAAAAA");
            }

            @Override
            public void method2() {
                System.out.println("BBBBBBBBB");
            }
        }.method2();

    }
}
