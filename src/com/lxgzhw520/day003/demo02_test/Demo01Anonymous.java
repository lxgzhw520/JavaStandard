package com.lxgzhw520.day003.demo02_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-14
# 文件名称: Demo01Anonymous.java
# 开发工具: IDEA
*/

public class Demo01Anonymous {
    public static void main(String[] args) {
        //匿名对象,不需要参数接收
        new Person().setName("无法重用");
        new Person().getName();
    }
}
