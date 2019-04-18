package com.lxgzhw520.day010.demo05_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-18
# 文件名称: Sort01.java
# 开发工具: IDEA
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort01 {
    public static void main(String[] args) {
        //按照年龄进行升序
        var list = new ArrayList<Person>();
        Collections.addAll(list,
                new Person("李珂瑶", 18),
                new Person("张宝富", 33),
                new Person("东周", 18),
                new Person("东周", 24)

        );
        System.out.println(list);
        //按照年龄进行升序
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for (Person p :
                list) {
            System.out.println(p);
        }

    }
}
