package com.lxgzhw520.day003.demo04_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-14
# 文件名称: Demo01Array.java
# 开发工具: IDEA
*/

public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person p1 = new Person("张大鹏", 22);
        Person p2 = new Person("李珂瑶", 18);
        Person p3 = new Person("丁一", 18);

        array[0] = p1;
        array[1] = p2;
        array[2] = p3;

        System.out.println(array[0].getName());
        System.out.println(array[1].getName());
        System.out.println(array[2].getName());
    }
}
