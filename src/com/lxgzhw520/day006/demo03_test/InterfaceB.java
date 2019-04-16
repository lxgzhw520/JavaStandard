package com.lxgzhw520.day006.demo03_test;

public interface InterfaceB {
    void methodA();
    private void methodB(){
        //不能重写 只能接口自己用
        System.out.println("私有方法");
    }
    static void methodC(){
        //不能重写 只能接口自己用
        System.out.println("静态方法");
    }
    default void methodD(){
        //可以重写 也可以不重写
        System.out.println("默认方法");
    }
}
