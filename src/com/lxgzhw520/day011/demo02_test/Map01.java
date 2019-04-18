package com.lxgzhw520.day011.demo02_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-18
# 文件名称: Map01.java
# 开发工具: IDEA
*/

import java.util.HashMap;
import java.util.Map;

public class Map01 {
    public static void main(String[] args) {
        var map = new HashMap<Person, String>();
        map.put(new Person("李珂瑶", 18), "一对一教学班");
        map.put(new Person("张宝富", 32), "一对一教学班");
        map.put(new Person("东周", 22), "Python001班");
        map.put(new Person("丁一", 18), "Python001班");
        System.out.println(map);

        for (Map.Entry<Person, String> entry :
                map.entrySet()) {
            System.out.println(entry.getKey().getName() + "\t:\t" + entry.getValue());
        }
        for (Person p :
                map.keySet()) {
            System.out.println(p.getName() + ":" + p.getAge());
        }
        System.out.println("================");
        var set = new HashMap<String, Person>();
        set.put("一对一教学班", new Person("李珂瑶", 18));
        for (String key :
                set.keySet()) {
            System.out.println(key + ":" + set.get(key).getName());
        }
    }
}
