package com.lxgzhw520.day012.demo06_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-19
# 文件名称: Main.java
# 开发工具: IDEA
*/

public class Main {
    public static void main(String[] args) {
        var mt = new MyThread();
//        mt.run();
        mt.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("Main:" + i);
        }
    }
}
