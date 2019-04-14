package com.lxgzhw520.day003.demo05_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-14
# 文件名称: Demo004ArrayListReturn.java
# 开发工具: IDEA
*/

import java.util.ArrayList;
import java.util.Random;

public class Demo004ArrayListReturn {
    public static void main(String[] args) {
        //用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        //1生成大集合
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100) + 1);
        }
        System.out.println(list);
        //2过滤并打印小集合
        print(list);
    }

    public static void print(ArrayList<Integer> list) {
        //过滤
        ArrayList<Integer> new_list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                new_list.add(list.get(i));
            }
        }
        System.out.println(new_list);
    }
}
