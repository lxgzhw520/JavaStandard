package com.lxgzhw520.day009.demo01_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-18
# 文件名称: Main.java
# 开发工具: IDEA
*/

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        var c = new HashSet<String>();
        //add()
        //remove() clear()
        //=
        //contains() isEmpty() size()
        c.add("李珂瑶");
        c.add("张宝富");
        System.out.println(c);
        System.out.println(c.toString());
        System.out.println(c.toArray());
        c.remove("张宝富");
        System.out.println(c.toString());


    }
}
