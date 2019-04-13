package com.lxgzhw520.day001;

public class Demo09Sum {
    public static void main(String[] args) {
        System.out.println(getSumOneToNum(100));
    }

    static int getSumOneToNum(int num) {
        //计算从1到num的值
        int sum = 0;
        for (int i = 0; i < num + 1; i++) {
            sum += i;
        }
        return sum;
    }
}
