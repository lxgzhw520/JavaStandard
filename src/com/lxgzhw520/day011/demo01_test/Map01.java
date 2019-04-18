package com.lxgzhw520.day011.demo01_test;/*
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
        //Map类似于Python中的字典
        var map = new HashMap<String, Integer>();
        map.put("李珂瑶", 18);
        map.put("张宝富", 33);
        map.put("东周", 18);
        map.put("丁一", 24);
        System.out.println(map);
        System.out.println(map.containsKey("李珂瑶"));//查询存在
        System.out.println(map.get("李珂瑶"));//获取
        System.out.println(map.remove("丁一"));//删除
        System.out.println(map);
        System.out.println(map.keySet());//键的集合
        System.out.println(map.entrySet());
        //遍历
        for (String key :
                map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
        for (Map.Entry<String, Integer> entry :
                map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
