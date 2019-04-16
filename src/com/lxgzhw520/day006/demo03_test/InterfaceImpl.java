package com.lxgzhw520.day006.demo03_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-16
# 文件名称: InterfaceImpl.java
# 开发工具: IDEA
*/

public class InterfaceImpl implements InterfaceA, InterfaceB {
    @Override
    public void method1() {
        System.out.println("普通方法才可以重写 interfaceA");
    }

    @Override
    public void methodA() {
        System.out.println("普通方法才可以重写 interfaceB");
    }
}
