package com.lxgzhw520.day009.demo02_test;/*
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
        c.add("张宝富");
        c.add("李珂瑶");
        System.out.println(c);

        for (String i : c) {
            System.out.println(i);

        }

        var nums = new HashSet<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        for (int i :
                nums) {
            System.out.print(i + "\t");

        }
    }
}
