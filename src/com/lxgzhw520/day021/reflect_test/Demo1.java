package com.lxgzhw520.day021.reflect_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-19
# 文件名称: Demo1.java
# 开发工具: IDEA
*/

import com.lxgzhw520.day021.domain_test.Person;
import com.lxgzhw520.day021.domain_test.Student;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        Class cls1 = Class.forName("com.lxgzhw520.day021.domain_test.Person");
        System.out.println(cls1);
        Class cls2 = Person.class;
        System.out.println(cls2);
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);
        System.out.println(cls1 == cls2);
        System.out.println(cls3 == cls2);
        Class c = Student.class;
        System.out.println(c == cls1);

    }
}
