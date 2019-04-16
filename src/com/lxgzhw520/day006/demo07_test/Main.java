package com.lxgzhw520.day006.demo07_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-16
# 文件名称: Main.java
# 开发工具: IDEA
*/

public class Main {
    public static void main(String[] args) {
        //1 创建USB接口 open打开 close关闭
        //2 鼠标类继承USB  +click点击方法
        //3 键盘类继承USB +type输入方法
        //4 电脑类  powerOn开机 powerOff关机
        //useDevice(USB usb)使用设备方法,接收USB类
        //1 打开设备 open
        //2 判断是鼠标还是键盘 instanceof
        //3 向下转型 调用具体类方法
        //4 关闭设备 close
        var c = new Computer();
        c.useDevice(new Keyboard());

    }
}
