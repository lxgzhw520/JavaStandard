package com.lxgzhw520.day001;

public class Demo07if_while_for {
    public static void main(String[] args) {
        //流程控制语句 if while for
        int age = 33;
        if (age > 18) {
            System.out.println("成年了");
        } else {
            System.out.println("未成年");
        }
        //switch
        switch (age) {
            case 33:
                System.out.println("成年的了");
                break;
            default:
                System.out.println("错误了");
        }
        //for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //while
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            ++i;
        }
    }
}
