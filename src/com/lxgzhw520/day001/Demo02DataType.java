package com.lxgzhw520.day001;

public class Demo02DataType {
    public static void main(String[] args) {
        //强制类型转换,适合于大类型转小类型
        int num = (int) 1000L;
        System.out.println(num);

        int num2 = (int) 99999999999999999L;
        //会丢失精度
        System.out.println(num2);
        System.out.println((int) 3.888);
    }
}
