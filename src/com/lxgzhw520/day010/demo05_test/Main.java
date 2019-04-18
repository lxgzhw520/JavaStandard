package com.lxgzhw520.day010.demo05_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-18
# 文件名称: Main.java
# 开发工具: IDEA
*/

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //同时添加多个元素
        var list = new ArrayList<String>();
        Collections.addAll(list, "李珂瑶", "张宝富", "张大鹏", "丁一", "东周");
        System.out.println(list);
        //打乱顺序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
