package com.lxgzhw520.day001;

public class Demo09MethodOverride {
    public static void main(String[] args) {
        //方法重载
        int a = 11, b = 22, c = 33;
        System.out.println(sum(a, b));
        System.out.println(sum(a, b, c));
    }

    static int sum(int a, int b) {
        System.out.println("a+b");
        return a + b;
    }

    static int sum(int a, int b, int c) {
        System.out.println("a+b+c");
        return a + b + c;
    }

}
