package com.lxgzhw520.day003.demo01_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-14 
# 文件名称: Demo01Scanner.java
# 开发工具: IDEA
*/

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1 录入数字
        System.out.println("请输入一个数字:");
        int num = sc.nextInt();
        System.out.println(num);
        //2 录入字符串
        System.out.println("请输入任意字符串:");
        String s = sc.next();
        System.out.println(s);

    }
}
