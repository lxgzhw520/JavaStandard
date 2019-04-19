package com.lxgzhw520.day021.reflect_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-19
# 文件名称: Main.java
# 开发工具: IDEA
*/

import com.lxgzhw520.day021.annotation.ReflectTest;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {
        //可以创建任意类的对象,可以执行任意方法
        Properties pro = new Properties();
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        Class cls = Class.forName(className);
        Object obj = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);
    }
}
