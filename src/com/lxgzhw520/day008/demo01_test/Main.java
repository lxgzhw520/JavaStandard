package com.lxgzhw520.day008.demo01_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-18
# 文件名称: Main.java
# 开发工具: IDEA
*/

public class Main {
    public static void main(String[] args) {
        var lky = new Person("李珂瑶", 18);
        System.out.println(lky.toString());
        var lky1 = new Person("李珂瑶", 18);
        System.out.println(lky.equals(lky1));
        System.out.println("aaa".equals("aaa"));
    }
}
