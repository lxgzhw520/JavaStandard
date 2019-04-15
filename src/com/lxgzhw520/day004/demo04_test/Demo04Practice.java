package com.lxgzhw520.day004.demo04_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-15
# 文件名称: Demo04Practice.java
# 开发工具: IDEA
*/

public class Demo04Practice {
    public static void main(String[] args) {
        //计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
        int count = 0;
        for (int i = -10; i < 5.9; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
