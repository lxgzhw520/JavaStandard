package com.lxgzhw520.day001;

public class Demo06Operator {
    public static void main(String[] args) {
        //自增运算符++
        //自减运算符--
        //在前里面+1  在后,下一次使用的时候再+1
        int num = 11;
        ++num;
        System.out.println(num);
        num++;
        System.out.println(num);
        //还是要在实际应用中多体会
        //+= -= *= /=
        num += 1;
        System.out.println(num);
        num *= 10;
        System.out.println(num);
        num /= 10;
        System.out.println(num);
        num -= 1;
        System.out.println(num);

        //三元运算符
        System.out.println(3 > 4 ? "真的" : "假的");
    }
}
