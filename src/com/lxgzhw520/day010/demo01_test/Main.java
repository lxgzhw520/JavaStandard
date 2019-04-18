package com.lxgzhw520.day010.demo01_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-18
# 文件名称: Main.java
# 开发工具: IDEA
*/

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("张宝富");
        list.add("李珂瑶");
        System.out.println(list);
        System.out.println(list.remove("张宝富"));
        System.out.println(list);
        list.add("张大鹏");
        System.out.println(list);
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());

        var linkList = new LinkedList<Integer>();
        linkList.add(1);
        linkList.add(13);
        linkList.add(12);
        linkList.add(133);
        System.out.println(linkList);
        linkList.removeLast();//删除最后一个
        System.out.println(linkList);
        linkList.removeFirst();//删除第一个
        System.out.println(linkList);
    }
}
