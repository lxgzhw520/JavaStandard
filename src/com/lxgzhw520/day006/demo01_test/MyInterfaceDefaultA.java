package com.lxgzhw520.day006.demo01_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-16
# 文件名称: MyInterfaceDefaultA.java
# 开发工具: IDEA
*/

public class MyInterfaceDefaultA implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现抽象方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("重写默认方法");
    }
}
