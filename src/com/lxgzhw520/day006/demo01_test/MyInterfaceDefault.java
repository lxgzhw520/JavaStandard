package com.lxgzhw520.day006.demo01_test;

public interface MyInterfaceDefault {
    public abstract void methodAbs();
    public default void methodDefault(){
        System.out.println("默认方法");
    }
}
