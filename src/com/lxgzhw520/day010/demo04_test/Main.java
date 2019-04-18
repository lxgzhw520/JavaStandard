package com.lxgzhw520.day010.demo04_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-18
# 文件名称: Main.java
# 开发工具: IDEA
*/

public class Main {
    public static void main(String[] args) {
        //可变参数
        add(1, 2, 3, 4, 4, 4, 4);
    }

    public static int add(int... arr) {
        int sum = 0;
        for (int i :
                arr) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }
}
