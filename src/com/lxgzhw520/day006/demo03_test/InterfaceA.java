package com.lxgzhw520.day006.demo03_test;

public interface InterfaceA {
    //接口有静态方法 普通方法 默认方法 私有方法
    void method1();
    default void method2(){
        System.out.println("默认方法");
    }
    static void method3(){
        System.out.println("静态方法");
    }
    private void method4(){
        System.out.println("私有方法");
    }
}
