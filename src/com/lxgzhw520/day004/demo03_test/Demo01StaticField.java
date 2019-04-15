package com.lxgzhw520.day004.demo03_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-15
# 文件名称: Demo01StaticField.java
# 开发工具: IDEA
*/

public class Demo01StaticField {
    public static void main(String[] args) {
        Student.room = "一对一教学班";
        Student lky = new Student("李珂瑶", 18);
        Student zbf = new Student("张宝富", 33);
        lky.show();
        zbf.show();
    }
}
