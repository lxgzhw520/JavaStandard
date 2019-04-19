package com.lxgzhw520.day021.test_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-19
# 文件名称: Main.java
# 开发工具: IDEA
*/

import com.lxgzhw520.day021.junit_test.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Main {
    @Before
    public void init() {
        System.out.println("init...");
    }

    @After
    public void close() {
        System.out.println("Close....");
    }

    @Test
    public void testAdd() {
        System.out.println("Test add()...");
        Calculator c = new Calculator();
        int result = c.add(33, 33);
        System.out.println(result);
        Assert.assertEquals(66, result);
    }

    @Test
    public void testSub() {
        System.out.println("Test sub()....");
        Calculator c = new Calculator();
        int result = c.sub(33, 33);
        System.out.println(result);
        Assert.assertEquals(0, result);
    }
}
