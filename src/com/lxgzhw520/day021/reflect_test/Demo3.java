package com.lxgzhw520.day021.reflect_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-19
# 文件名称: Demo3.java
# 开发工具: IDEA
*/

import com.lxgzhw520.day021.domain_test.Person;

import java.lang.reflect.Constructor;

public class Demo3 {
    public static void main(String[] args) throws Exception {
        //获取构造对象 .getConstructor()
        //创建对象 .newInstance()
        Class c = Person.class;
        Constructor cs = c.getConstructor(String.class, int.class);
        System.out.println(cs);
        Object p = cs.newInstance("张宝富", 33);
        System.out.println(p);
    }
}
