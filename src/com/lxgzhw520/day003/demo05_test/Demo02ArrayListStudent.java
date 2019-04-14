package com.lxgzhw520.day003.demo05_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-14
# 文件名称: Demo02ArrayListStudent.java
# 开发工具: IDEA
*/

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        //生成学生对象的泛型列表并打印
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张大鹏", 25));
        list.add(new Student("李珂瑶", 18));
        list.add(new Student("张宝富", 33));
        list.add(new Student("东周", 25));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + "----" + list.get(i).getAge());
        }
    }
}
