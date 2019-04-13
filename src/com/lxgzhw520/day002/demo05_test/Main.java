package com.lxgzhw520.day002.demo05_test;

public class Main {
    public static void main(String[] args) {
        //姓名 年龄 班级
        Student zhangdapeng = new Student();
        zhangdapeng.setName("张大鹏");
        zhangdapeng.setAge(22);
        zhangdapeng.setClass_no("Java001");

        System.out.println(zhangdapeng.getName());
        System.out.println(zhangdapeng.getAge());
        System.out.println(zhangdapeng.getClass_no());
    }
}
