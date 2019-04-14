package com.lxgzhw520.day003.demo05_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-14
# 文件名称: Demo003ArrayListPrint.java
# 开发工具: IDEA
*/

import java.util.ArrayList;

public class Demo003ArrayListPrint {
    public static void main(String[] args) {
        //按照指定类型打印 [姓名1,....,姓名n]
        ArrayList<String> list = new ArrayList<>();
        list.add("张大鹏");
        list.add("李珂瑶");
        list.add("张宝富");
        list.add("东周");
        System.out.println(list);

        //姓名1@姓名2...@姓名n
        print(list);
    }

    public static void print(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                System.out.print(list.get(i) + "@");

            } else {
                System.out.println(list.get(i));
            }
        }
    }
}
