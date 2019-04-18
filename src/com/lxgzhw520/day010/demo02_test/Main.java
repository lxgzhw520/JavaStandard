package com.lxgzhw520.day010.demo02_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-18
# 文件名称: Main.java
# 开发工具: IDEA
*/

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //集合中存储对象
        var set = new HashSet<Person>();
        set.add(new Person("李珂瑶", 18));
        set.add(new Person("张宝富", 33));
        System.out.println(set);

        for (Person p :
                set) {
            System.out.println(p.toString());
        }
    }
}
