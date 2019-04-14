package com.lxgzhw520.day003.demo04_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-14
# 文件名称: Demo03ArrayListMethod.java
# 开发工具: IDEA
*/

import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        //泛型数组的方法
        ArrayList<String> list = new ArrayList<>();
        list.add("李珂瑶");
        list.add("张宝富");
        list.add("东周");
        list.add("丁一");
        System.out.println(list);
        //根据索引获取值 get
        System.out.println(list.get(1));

        //根据索引删除值 remove
        System.out.println(list.remove(1));
        //获取集合长度
        System.out.println(list.size());
        System.out.println(list);
    }
}
