package com.lxgzhw520.day011.demo03_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-18
# 文件名称: Map01.java
# 开发工具: IDEA
*/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Map01 {
    public static void main(String[] args) {
        //带Link的是红黑树,增删够快,查询慢,有序
        var map01 = new HashMap<String, String>();
        map01.put("a", "a");
        map01.put("a", "a");//不会报错 会自动过滤
        System.out.println(map01);
        var map02 = new LinkedHashMap<String, String>();
        map02.put("a", "a");
        map02.put("a", "a");//不会报错 会自动过滤
        System.out.println(map02);

        //统计一个字符串中各个字符出现的次数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:\n");
        var s = sc.next();
        System.out.println(s);
        //遍历字符串统计
        var map = new HashMap<Character, Integer>();
        for (char c :
                s.toCharArray()) {
            if (map.containsKey(c)) {
                Integer value = map.get(c);
                value++;
                map.put(c, value);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
        System.out.println("========================");
        for (char c :
                map.keySet()) {
            System.out.println(c + "共出现了:" + map.get(c) + "次");
        }
    }
}
