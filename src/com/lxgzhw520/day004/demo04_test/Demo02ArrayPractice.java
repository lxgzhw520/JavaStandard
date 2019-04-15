package com.lxgzhw520.day004.demo04_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-15
# 文件名称: Demo02ArrayPractice.java
# 开发工具: IDEA
*/

import java.util.Arrays;
import java.util.Scanner;

public class Demo02ArrayPractice {
    public static void main(String[] args) {
        //字符串倒序输出
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入任意字符串:");
        String str = sc.next();

        //1 将字符串拆分为数组
        char[] arr = str.toCharArray();
        //2 数组排序
        Arrays.sort(arr);
        //3 转换为字符串打印
        //arr.forr
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
