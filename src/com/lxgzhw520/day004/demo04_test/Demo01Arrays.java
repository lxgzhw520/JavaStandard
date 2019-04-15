package com.lxgzhw520.day004.demo04_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-15
# 文件名称: Demo01Arrays.java
# 开发工具: IDEA
*/

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        //Arrays的常用方法
        int[] arr = {1, 2, 333, 121, 213, 12311};
        //toString()转换为字符串
        System.out.println(Arrays.toString(arr));
        //sort()排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
