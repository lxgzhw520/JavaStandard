package com.lxgzhw520.day004.demo02_test;
/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-15
# 文件名称: Demo01String.java
# 开发工具: IDEA
*/

import java.util.Scanner;

public class Demo01String {
    public static void main(String[] args) {
        //获取字符串
        Scanner sc = new Scanner(System.in);
        //1 比较是否相等 equal
        System.out.println("请输入第一个字符串:");
        String str1 = sc.next();
        System.out.println("请输入第二个字符串:");
        String str2 = sc.next();

        System.out.println("是否相等:" + str1.equals(str2));
        //2 拼接 concat
        System.out.println("拼接:" + str1.concat(str2));
        //3 获取指定位置的字符 charat
        System.out.println("位置3的字符:" + str1.charAt(3));
        //4 获取指定字符的索引 indexof
        System.out.println("a的索引:" + str1.indexOf('a'));
    }
}
