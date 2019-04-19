package com.lxgzhw520.day021.reflect_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-19
# 文件名称: Demo2.java
# 开发工具: IDEA
*/

import com.lxgzhw520.day021.domain_test.Person;

import java.lang.reflect.Field;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Field[] fields = personClass.getFields();//获取所有的字段
        for (Field f :
                fields) {
            System.out.println(f);
        }
        System.out.println("==========");
        Field a = personClass.getField("a");//反射
        System.out.println(a);
        Person p = new Person("张宝富", 33);
        Object value = a.get(p);
        System.out.println(value);
        a.set(p, "李珂瑶");
        System.out.println(p);
        System.out.println("==========");
        Field[] fields1 = personClass.getDeclaredFields();
        for (Field f :
                fields1) {
            System.out.println(f);
        }
        //反射
        Field d = personClass.getDeclaredField("d");
        d.setAccessible(true);
        Object value2 = d.get(p);
        System.out.println(value2);

    }
}
