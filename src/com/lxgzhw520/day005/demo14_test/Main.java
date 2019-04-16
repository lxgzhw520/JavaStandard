package com.lxgzhw520.day005.demo14_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-16
# 文件名称: Main.java
# 开发工具: IDEA
*/

public class Main {
    public static void main(String[] args) {
        //群主发红包 三个成员领取红包
        /**
         * 1 人员类
         *  姓名 name
         *  余额 money
         *  身份 role
         *      用一个标记,确保管理员只有一个
         *
         *  方法
         *      发红包(总额,分成多少份):将红包总额随机分成指定份数,装在一个红包列表中,管理员余额减去红包总额
         *      抢红包:从红包列表中随机抽取一份,将红包转入到个人余额
         *      查看余额:查看个人钱包余额
         */
        Person m = new Person(1000, "张宝富", "管理员");
        Person p1 = new Person(100, "李珂瑶", "普通成员");
        Person p2 = new Person(100, "丁一", "普通成员");
        Person p3 = new Person(100, "东周", "普通成员");

        System.out.println(m.getMoney());
        System.out.println(p1.getMoney());
        System.out.println(p2.getMoney());
        System.out.println(p3.getMoney());
        System.out.println("----------------------");
        //发红包
        m.sendRedPackage(100, 3);
        //抢红包
        p1.receiveRedPackage();
        p2.receiveRedPackage();
        p3.receiveRedPackage();
        System.out.println(m.getMoney());
        System.out.println(p1.getMoney());
        System.out.println(p2.getMoney());
        System.out.println(p3.getMoney());

    }
}
