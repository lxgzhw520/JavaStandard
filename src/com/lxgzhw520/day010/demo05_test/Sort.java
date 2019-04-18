package com.lxgzhw520.day010.demo05_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-18
# 文件名称: Sort.java
# 开发工具: IDEA
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        //排序
        var list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 3, 3, 3, 3, 232, 23, 12, 121, 12);
        System.out.println(list);
        Collections.sort(list);//默认升序
        System.out.println(list);
        //重写排序规则
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;//降序 升序是o1-o2
            }
        });
        System.out.println(list);
    }
}
