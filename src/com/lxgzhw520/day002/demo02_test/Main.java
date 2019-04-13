package com.lxgzhw520.day002.demo02_test;

public class Main {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "苹果";
        p.color = "白色";
        p.price = 9999;

        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println(p.color);

        p.call("妈妈");
        p.sendMessage();
    }
}
