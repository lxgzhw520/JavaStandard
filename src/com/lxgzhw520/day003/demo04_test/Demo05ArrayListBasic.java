package com.lxgzhw520.day003.demo04_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-14
# 文件名称: Demo05ArrayListBasic.java
# 开发工具: IDEA
*/

import java.util.ArrayList;

public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        //基本数据类型的 泛型数组
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(111);
        list.add(222);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
