package com.lxgzhw520.day003.demo01_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-14
# 文件名称: Demo02Scanner.java
# 开发工具: IDEA
*/

import java.util.Scanner;

public class Demo02Scanner {
    public static void main(String[] args) {
        //录入两个数字,做加法运算并打印
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数:");
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);
    }
}
