package com.lxgzhw520.day003.demo03_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-14
# 文件名称: Demo02Random.java
# 开发工具: IDEA
*/


import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        //生成100个随机数
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(r.nextInt(100));
        }
    }
}
