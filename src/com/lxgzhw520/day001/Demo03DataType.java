package com.lxgzhw520.day001;

public class Demo03DataType {
    public static void main(String[] args) {
        //字符转数字 是根据ASCII转的
        System.out.println((int) 'a');

        //字符串+数字 会自动转换为数字类型
        System.out.println('a' + 11);

        //字符串+数字 转换为数字
        System.out.println("aabbb" + 33);
    }
}
