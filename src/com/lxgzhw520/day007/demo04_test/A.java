package com.lxgzhw520.day007.demo04_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-17
# 文件名称: A.java
# 开发工具: IDEA
*/

public class A {
    public int show(){
        class B{
            int b;
            void show(){
                System.out.println("BBBBBBB");
            }
        }
        var b=new B();
        b.b=333;
        b.show();
        return b.b;
    }
}
