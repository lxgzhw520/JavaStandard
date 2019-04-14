package com.lxgzhw520.day003.demo03_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-14
# 文件名称: Demo04RandomGame.java
# 开发工具: IDEA
*/

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGame {
    public static void main(String[] args) {
        //随机数游戏 猜数字
        //1 生成随机数
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int guessNum = r.nextInt(100) + 1;
        //2 用户不断猜测并对比
        while (true) {
            System.out.println("请输入一个1-100之间的数:");
            int userNum = sc.nextInt();
            if (guessNum == userNum) {
                System.out.println("猜中了");
                break;
            } else {
                if (guessNum > userNum) {
                    System.out.println("小了");
                } else {
                    System.out.println("大了");
                }
            }
        }
        System.out.println("游戏结束.");
    }
}
