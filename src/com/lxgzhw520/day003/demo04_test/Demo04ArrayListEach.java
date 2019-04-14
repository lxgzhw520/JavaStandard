package com.lxgzhw520.day003.demo04_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-14
# 文件名称: Demo04ArrayListEach.java
# 开发工具: IDEA
*/

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        //遍历数组
        ArrayList<String> list = new ArrayList<>();
        list.add("李珂瑶");
        list.add("张宝富");
        list.add("张大鹏");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
