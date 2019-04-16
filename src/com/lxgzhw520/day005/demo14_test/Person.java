package com.lxgzhw520.day005.demo14_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-16
# 文件名称: Person.java
# 开发工具: IDEA
*/

import java.util.ArrayList;
import java.util.Random;

public class Person {
    private int money;
    private String name;
    private String role;
    private int manager_count = 0;
    //将红包列表设为所有对象都可以访问,方便抢红包和发红包
    public ArrayList<Integer> list = new ArrayList<>();


    public Person() {
    }

    public Person(int money, String name, String role) {
        if (role.equals("管理员")) {
            if (this.manager_count == 0) {
                this.manager_count++;
            } else {
                System.out.println("管理员已存在");
                //如何拒绝实例化呢
                return;
            }
        }
        this.money = money;
        this.name = name;
        this.role = role;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //发红包的方法
    public void sendRedPackage(int money, int num) {
        //如果是管理员 可以发红包 不然就不可以
        if (this.role.equals("管理员")) {
            //如果红包小于余额可以发,不然就不可以
            if (money <= this.money) {
                //管理员红包减少
                this.money -= money;
                //将红包随机分成num份
                Random r = new Random();
                int newMoney = 0;
                for (int i = 0; i < num; i++) {
                    if (i < num - 1) {
                        //如果不是最后一次 随机生成红包金额
                        newMoney = r.nextInt(money - newMoney-1);
                        list.add(newMoney);
                        money -= newMoney;
                    } else {
                        //最后一次将剩下的所有钱作为一份
                        list.add(money);
                        money = 0;
//                        return list;
                    }
                }
            } else {
                System.out.println("钱包余额不足.");
//                return null;
            }
//            return list;
        } else {
            System.out.println("非管理员不可以发红包.");
//            return null;
        }

    }

    //收红包的方法
    public void receiveRedPackage() {
        Random r = new Random();
        int len = list.size();
        int index = r.nextInt(len-1);
        //随机获取一份
        int redMoney = list.get(index);
        this.money += redMoney;
        list.remove(index);
    }
}
