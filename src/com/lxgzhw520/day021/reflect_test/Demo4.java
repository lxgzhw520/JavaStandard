package com.lxgzhw520.day021.reflect_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-19
# 文件名称: Demo4.java
# 开发工具: IDEA
*/

import com.lxgzhw520.day021.domain_test.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo4 {
    public static void main(String[] args) throws Exception {
        //获取Class对象 .class
        //获取指定名称的方法 getMethod("name")
        //执行方法.invoke(对象实例)
        //获取所有public的方法 .getMethods()
        Class c = Person.class;
        Method m = c.getMethod("eat");
        //无参构造反射
        Constructor cs = c.getConstructor();
        Object p = cs.newInstance();
        m.invoke(p);

        Method eat = c.getMethod("eat", String.class);
        eat.invoke(p, "饭");

        //获取所有的方法
        Method[] methods01 = c.getMethods();
        for (Method m1 :
                methods01) {
//            m1.invoke(p);
            System.out.println(m1);
        }
        Method[] methods02 = c.getDeclaredMethods();
        for (Method m2 :
                methods02) {
//            m2.invoke(p);
            System.out.println(m2);
        }
    }
}
