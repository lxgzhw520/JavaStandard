package com.lxgzhw520.day003.demo03;

import java.util.Random;

public class Demo02Random {

    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            //包左不包右
            int num = r.nextInt(100); // 范围实际上是0~9
            System.out.println(num);
        }
    }

}
