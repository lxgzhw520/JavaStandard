package com.lxgzhw520.day002.demo02_test;

public class Phone {
    String brand;
    String color;
    double price;

    //call sendMessage
    public static void call(String name) {
        System.out.println("给" + name + "打电话.");
    }

    public static void sendMessage() {
        System.out.println("群发短信.");
    }
}
